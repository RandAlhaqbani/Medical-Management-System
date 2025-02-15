package javaproject;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileWriter;

public class initializer {

    static Clinic c2 = new Clinic(2, 3);
    static Clinic c1 = new Clinic(3, 5);
    static Clinic c3 = new Clinic(3 ,4);
    static Name pname_1= new Name("Ahmed","khlifa","Ahmed");
    static Patients P1=new Patients(101,"O+",pname_1,102,25,"Male");
    static appointment AP1;
    static  ArrayList<Clinic> clinics = new ArrayList<>();
    public  initializer(){

    }


    public static void initializeDoctors(){

        Write writer=new Write();


       //initializer Doctors
        // De.Norah
        Doctor Norah= new Doctor(2.133,29000.0,12.4,"Neurosurgery",new Name("Norah","Fahad","Almatlaq"), 1143305,29,"Female");
        c1.addDoctor(Norah);

        c1.addDoctor(new Doctor(1.108,33000.50,10.8,"Neurosurgery",new Name("Khalid","Omar","AlHamad"), 1156200,38,"Male"));
        c1.addDoctor(new Doctor(4.220,28000.50,7.0,"Neurosurgery",new Name("Sarah","Saud","Alrajhe"), 1194390,32,"Female"));
        c1.addDoctor(new Doctor(3.100,32000.0,9.4,"Neurosurgery",new Name("Nasaer","Naif","Almdag"), 1172385,44,"Male"));

        c2.addDoctor(new Doctor(2.204,44000.0,12.4,"Orthopedic surgery",new Name("Yara","Saad","Alqahtani"), 1122905,32,"Female"));
        c2.addDoctor(new Doctor(3.309,50000.0,17.0,"Orthopedic surgery",new Name("Omar","Ahmad","Almaqbal"), 1198215,68,"Male"));


        c3.addDoctor(new Doctor(4.321,66000.0,9.4,"Heart and surgery specialty",new Name("Anwar","Mohanad","Alohaby"), 1199374,43,"Female"));
        c3.addDoctor(new Doctor(2.304,59000.0,12.0,"Heart and surgery specialty",new Name("Khalid","Fahad","Almasoud"), 1136432,46,"Male"));

        clinics.add(c1);
        clinics.add(c2);
        clinics.add(c3);

    }

    public static void initializeNurses(){

        Name Tala=new Name("Tala","Ahmed","Khalid");
        Name Ahmed=new Name("Ahmed","Khalid","ahmed");
        Nurse Nu1= new Nurse(15000, 7, "general", Tala ,1001, 23, "female") ;
        Nurse Nu2= new Nurse(15000, 7, "general", Ahmed ,1001, 23, "Male") ;
    }

    public static void listInitializedDoctors(){
        c1.listAllDoctor();
        c2.listAllDoctor();
        c3.listAllDoctor();
    }

    public static void listInitializedClinic(){
        for (Clinic c : clinics) {

            if (c != null)

                System.out.println(c.toString());

        }
    }



    public static void initializeAppointment(){
        AP1 =new appointment(11,12,22,30,12,P1,"in progress",120);

    }
     public static void listInitializedAppointment(){
        AP1.print();
     }

}
