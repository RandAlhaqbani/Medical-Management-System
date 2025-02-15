package javaproject;

import javaproject.*;
import java.io.*;
import java.util.*;
import javaproject.Clinic.*;

public class Services implements Hospital {
//  Patients ps= new  Patients(0," ",new Name(" "," ", " "),0,0," ");
  
    private ArrayList<Clinic> clinics;
    
    private Patients Patients;
    private Scanner input;
    private Clinic clinic;
   //private appointment appointment;
  //appointment app = new appointment(0,0,0,0,new Patients()," ");
  
  
  // appointment app = new appointment
           
           

    public Services() {
        clinics = new ArrayList<>();
        input = new Scanner(System.in);
       
           }

@Override
    public void displayClinic() {
         
        for (Clinic c : clinics) {
            
            if (c != null) 
          
                System.out.println(c.toString());
            
        }
    }

    @Override
    public Clinic getClinicById(int appontmentNum) {
        for (Clinic c : clinics) {
            if (c != null) {
                if (c.getAppontmentNum() == appontmentNum) {
                    return c;
                }
            }
        }
        return null;
    }

    @Override
    public void newAppointment() {
try{
        displayClinic();
        System.out.println("Please Enter clinic ID:");
        int ID = input.nextInt();
        Clinic cc = getClinicById(ID);
        System.out.println("Enter your Information:");
        System.out.println(" Enter your First Name :");
        String name1 = input.next();
        System.out.println(" Enter your Middle Name :");
        String name2 = input.next();
        System.out.println(" Enter your Last Name :");
        String name3 = input.next();
        System.out.println(" Patient Id :");
        int id = input.nextInt();
        System.out.println("Enter your blood type:");
        String bloodtype = input.next();
        System.out.println(" Patient Age :");
        int age = input.nextInt();
        System.out.println(" Patient Gender:");
        String gender = input.next();
         
        Patients ps= new  Patients(id,bloodtype,new Name(name1,name2,name3),id,age,gender);
       
       
       appointment app = new appointment(ps);
         app.confirm();
        clinic.addAppointment(app);
} catch(InputMismatchException ex){
    System.err.println("Invalid Input");
    
}
   // return;
     
// this object need to rethink about it
    
    }

    @Override
    public void showAppointmentInfo() {
        try {
            System.out.print("Enter Appointment Id:");
            int idd = input.nextInt();
            appointment a = clinic.getAppointmentById(idd);
            if (a == null) {
                System.out.println("No Appointment");
                return;
            }
            a.print();

        } catch (InputMismatchException ex) {
            System.err.println("Invalid Input !");

        }

    }

    @Override
    public void cancellAppointment() {
        try {
            System.out.println("Enter Appointent Id:");
            int IDD = input.nextInt();
            appointment pp = clinic.getAppointmentById(IDD);
            if (pp == null) {
                System.out.println("No appointment");
                return;
            }
            pp.Cancelled();

        } catch (InputMismatchException ex) {
            System.err.println("Invalid Input !");

        }

    }
    
    
    //_________________________________________________________________________
   
//read and save data to files
  //  @Override
    public void readClinics() {
        ObjectInputStream ois = null;
        try {
            System.out.println("Reading data from file....");
            ois = new ObjectInputStream(new FileInputStream(new File("clinics.ser")));

            while (true) {
                try {
                    Clinic clinic = (Clinic) ois.readObject();
                    clinics.add(clinic);
                } catch (EOFException ex) {
                    break;
                }
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Error: File Not Found\n" + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error: Can't read data.\n" + ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                    System.out.println("Error during closing stream");
                }
            }
        }
    }

  //  @Override
    public void saveClinics() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File("clinics.ser")));

            for (Clinic clinic : clinics) {
                oos.writeObject(clinic);
            }
            System.out.println("All data saved!");
        } catch (FileNotFoundException ex) {
            System.err.println("Error: File Not Found.");
        } catch (IOException ex) {
            System.err.println("Error: Can't save data." + ex);
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    System.out.println("Error during closing stream");
                }
            }
        }
    }

    public void quit() {
        System.out.print("Do you want to save data? (Y or N): ");
        char answer = input.next().toUpperCase().charAt(0);
        if (answer == 'Y') {
            //write a method to save appointments and call it here
            System.out.println("Data saved successfully.");
        }
        System.out.println("Thank you!");
    }

    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //_________________________________________________________________________________

/*

    public void saveClinics(){
        FileWriter write = new  FileWriter ();
        
        write.saveClinics("clinics.ser", clinics);
    }
    
    public void saveAppointment(){
       // FileWriter wr = new FileWriter ();
        for(Clinic clinic: clinics)
          ArrayList<appointment> apps = clinic.getAppointment();
          if(apps.size() > 0){
       // wr.saveAppointment;
    }
        FileWriter.saveAppointment("appointment.ser" , apps);
        
    }
*/



