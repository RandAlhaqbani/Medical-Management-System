package javaproject;

import java.util.ArrayList;
import java.io.Serializable;
import javaproject.Patients;
import javaproject.Doctor;
public class Clinic implements Serializable {

    private ArrayList<appointment> patientList;
    private final int MAX_PATIENT;
    private Patients[] patient;
    private int numOfPatient;
    private Doctor [] doctor;
    private final int MAX_DOCTOR;
    private int numOfDoctor=0;
    private int appontmentNum;
    private appointment appointment;

    public Clinic(int Patients,int doctor) {
        this.patient = patient;
        this.numOfPatient = numOfPatient;
        patientList = new ArrayList<>();
        MAX_PATIENT = Patients;
        this.patient = new Patients[MAX_PATIENT];
        MAX_DOCTOR=doctor;
        this.doctor= new Doctor[MAX_DOCTOR];
        
    }
    
    public void cancelAppointment(int appontmentNum ){
        for(appointment a :patientList )
            if(a.getAppontmentNum()==appontmentNum)
            {
                a.Cancelled();
            
            }
      
            }
    
    public void displayAppointment( int appontmentNum){
        for(appointment d :patientList)
            if(d.getAppontmentNum()==appontmentNum){
                d.print();
            }
    }
    
    public void addDoctor(Doctor doctors){
        if(numOfDoctor>=MAX_DOCTOR){
            System.out.println("You can't add more doctor !");
        return;
        }
        doctor [numOfDoctor++]= doctors;
        System.out.println("num Of Doctor is "+numOfDoctor);
        
    }
        
    public void listAllDoctor() {

        if (numOfDoctor == 0) {
            System.out.println("There is no Doctors in the clinic yet");
        }else {
            for (Doctor d : doctor) {
                if (d != null) {
                    d.display();
                    System.out.println("-------------------------------------------------------------------------------------------");
                }

            }
        }




    }
     


    public void addPatients(Patients p) {
        if (numOfPatient >= MAX_PATIENT) {
            System.out.println("Sorry we can't add more patients");
            return;
        }
        patient[numOfPatient++] = p;
    }

    public void listAllPatients() {
        if (numOfPatient == 0) {
            System.out.println("There is no patients in the clinic yet");
        }
        for (Patients pa : patient) {
            if (pa != null) {
                pa.display();
            }
          
        }

    }

    public Clinic() {
        
        // we dont now what is this
        this(1,1); 
    }
    
    public appointment getAppointmentById(int  appontmentNum){
   for(appointment p : patientList )
       if(p.getAppontmentNum()==appontmentNum){
         return appointment;  
          
       }
return null;
    }

    public void addAppointment(appointment patientList) {
        this.patientList.add(patientList);
       
    }
    
    

    public void listAllAppointment() {
        for (appointment l : patientList) {
            System.out.println(l);

        }

    }

    public Doctor[] getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor[] doctor) {
        this.doctor = doctor;
    }

    public int getNumOfDoctor() {
        return numOfDoctor;
    }

    public void setNumOfDoctor(int numOfDoctor) {
        this.numOfDoctor = numOfDoctor;
    }

    public int getAppontmentNum() {
        return appontmentNum;
    }

    public void setAppontmentNum(int appontmentNum) {
        this.appontmentNum = appontmentNum;
    }

    public appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(appointment appointment) {
        this.appointment = appointment;
    }
    
  

    public ArrayList<appointment> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<appointment> patientList) {
        this.patientList = patientList;
    }

    public Patients[] getPatient() {
        return patient;
    }

    public void setPatient(Patients[] patient) {
        this.patient = patient;
    }

    public int getNumOfPatient() {
        return numOfPatient;
    }

    public void setNumOfPatient(int numOfPatient) {
        this.numOfPatient = numOfPatient;
    }

    public void displayDoctor() {

    }

    public void displayPatient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addPatient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayClincInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayErgent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayNurse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayInternStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
// need to  rewrite
    @Override
    public String toString() {
        return "Clinic{" + "patientList=" + patientList + ", MAX_PATIENT=" + MAX_PATIENT + ", patient=" + patient + ", numOfPatient=" + numOfPatient + ", doctor=" + doctor + ", MAX_DOCTOR=" + MAX_DOCTOR + ", numOfDoctor=" + numOfDoctor + ", appontmentNum=" + appontmentNum + ", appointment=" + appointment + '}';
    }
        
    
    

}
