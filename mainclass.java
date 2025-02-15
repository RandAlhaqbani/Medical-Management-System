package javaproject;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class mainclass {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        initializer initializer=new initializer();


       Hospital S = new Services();
       Services m = new Services();
        pharmacy b1 = new pharmacy();

        Clinic c1 = new Clinic();

       
        appointment p = new appointment();


        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("                                    *** Welcome to the Medical System ***");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("                                                      MAIN MENU                                      ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

        try {

            int num;
            int sub;
            int A;//Appointment
            int P;
            
            do {
                System.out.println(" What would you like to do?");
                System.out.println(" 1.Display the Docters list");
                System.out.println(" 2.Patient ");
                System.out.println(" 3.Display Clinec info");
                System.out.println(" 4.Appointment");
                System.out.println(" 5.Display Nurse list");
                System.out.println(" 6.Display intern Students list");
                System.out.println(" 7.pharmacy");
                System.out.println(" If you'r done press 0");
                System.out.println(" Please select a number:");
                num = input.nextInt();

                switch (num) {
                    case 1:
                        initializer.initializeDoctors();
                        System.out.println("Docter....");
                        initializer.listInitializedDoctors();
                        break;
                    case 2:
                        System.out.println("What Would You Like To Do?");
                        System.out.println("1.Add Patient");
                        System.out.println("2.List All Patient");
                        P=input.nextInt();
                        if (P==1){
                            System.out.println("enter the File Num: ");
                            int FileNum=input.nextInt();
                            System.out.println("enter the bloodType: ");
                            String bloodType = input.next();
                            System.out.println(" Enter your First Name :");
                            String name1 = input.next();
                            System.out.println(" Enter your Middle Name :");
                            String name2 = input.next();
                            System.out.println(" Enter your Last Name :");
                            String name3 = input.next();
                            System.out.println("enter the ID: ");
                            int Id=input.nextInt();
                            System.out.println("enter the Age: ");
                            int Age=input.nextInt();
                            System.out.println(" Enter your Gender:");
                            String gender = input.next();
                            Patients PS = new   Patients (FileNum,bloodType,new Name(name1,name2,name3),Id,Age,gender);
                            c1.addPatients(PS);
                        }else {
                            System.out.println(" List All Patient: ");
                            c1.listAllPatients();
                        }
                        break;
                    case 3:
                        initializer.initializeDoctors();
                        initializer.listInitializedClinic();
                        S.displayClinic();

                        
                        break;

                    case 4:
                        System.out.println("We have two serves\n1:New appointment\n2:Appointment info");
                        System.out.print("Can you enter the number associated with the service :");
                        sub = input.nextInt();
                        if (sub==1){
                            System.out.println("New appointment");
                            m.newAppointment();
                        }else {
                            System.out.println("Appointment info");
                            m.showAppointmentInfo();
                        }
                        m.displayClinic();
                        m.cancellAppointment();
                        System.out.println("44444");
                        break;

                    case 5:
                        System.out.println("What would you like to do");

                    //    System.out.println("1.new Appointment"); no need it used in 4
                        System.out.println("2.List all Appointment");
                        A = input.nextInt();
                        if (A==1){
                                System.out.println("welcome to the new Appointment: ");

                                    c1.addAppointment(p);
                       }else  {
                            System.out.println("Welcome to list all apointment");
                            initializer.initializeAppointment();
                            initializer.listInitializedAppointment();
                            c1.listAllAppointment();
                        }
                        System.out.println("______________________________________________________");
                        break;

                    case 6:
                        System.out.println("Intern Students");
                   break;
                    case 7:

                        b1.medInfo();
                        int choice;
                        System.out.println("******Medicine Bill******");
                        do {

                            System.out.println("Enter The med you would like to purches ");
                            System.out.println("or press 0 if you would like to check");
                            choice = input.nextInt();

                            b1.med(choice);

                        } while (choice != 0);

                        System.out.println("please inform us if you have insurace press 1 if you dont press 0");
                        int optione = input.nextInt();
                        b1.checkInsurance(optione);

                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                        break;
                    default:
                        System.out.println("The number you select is uncorrect");
                }

            } while (num != 0);

        } catch (InputMismatchException ex) {
            System.err.println("Not correct input");
        }



        System.out.println("Thank you!");

        // public void DisplayInfo(){
        
        
        
       

    }
    
}
