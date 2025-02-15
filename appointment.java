
package javaproject;
import javaproject.Patients;

public class appointment {
    private int appointmentDay;
    private int appointmentMonth;
    private int appointmentYear;
    private int appointmentTimeMeinut;
    private int appointmentTimeHours;
    private Patients patients;
    private String appointmentSituation;
    private int appontmentNum;
   
    public appointment(Patients patients){

    }
    
    
    
    
     //default constracter

    public appointment() {
    }
    public appointment(int appointmentDay, int appointmentMonth,int appointmentYear,int appointmentTimeMeinut, int appointmentTimeHours,
                       Patients patients, String appointmentSituation,int appontmentNum) {
        this.appointmentDay=appointmentDay;
        this.appointmentMonth=appointmentMonth;
        this.appointmentYear=appointmentYear;
        this.appointmentTimeMeinut=appointmentTimeMeinut;
        this.appointmentTimeHours=appointmentTimeHours;
        this.patients=patients;
        this.appointmentSituation=appointmentSituation;
        this.appontmentNum=appontmentNum;

    }

     public void print(){
        patients.display();
         System.out.println("Appointment date: "+appointmentDay+"-"+appointmentMonth+"-"+appointmentYear);
         System.out.println("Appointment Time at : "+appointmentTimeHours +":"+appointmentTimeMeinut);
         System.out.println("Appointment Situation: "+appointmentSituation);
    }
    
    public void confirm(){
      setAppointmentSituation("Confirmed");
       System.out.println("Your Appointment is confirmed");
    //  print();
        
    }
    
    public void Cancelled(){
         setAppointmentSituation("Cancelled");
         System.out.println("Your Appointment is cancelled !");
        
    }

    public int getAppontmentNum() {
        return appontmentNum;
    }

    public void setAppontmentNum(int appontmentNum) {
        this.appontmentNum = appontmentNum;
    }
    
    
    
    
    public int getAppointmentDay() {
        return appointmentDay;
    }

    public void setAppointmentDay(int appointmentDay) {
        this.appointmentDay = appointmentDay;
    }

    public int getAppointmentMonth() {
        return appointmentMonth;
    }

    public void setAppointmentMonth(int appointmentMonth) {
     if(appointmentMonth>=1 && appointmentMonth<=12 )
         this.appointmentMonth=appointmentMonth;

    }

    public int getAppointmentYear() {
        return appointmentYear;
    }

    public void setAppointmentYear(int appointmentYear) {
        this.appointmentYear = appointmentYear;
    }

    public int getAppointmentTime() {
        return appointmentTimeHours;
    }

    public void setAppointmentTime(int appointmentTime) {
        this.appointmentTimeHours = appointmentTime;
    }

    public Patients getPatients() {
        return patients;
    }

    public void setPatients(Patients patients) {
        this.patients = patients;
    }

    public String getAppointmentSituation() {
        return appointmentSituation;
    }

    public void setAppointmentSituation(String appointmentSituation) {
        this.appointmentSituation = appointmentSituation;
    }
/*
    @Override
    public String toString() {
     return String.format("Appointment Data: %s-%s-%s%n Appointment Time:%s%n%s",appointmentDay,appointmentMonth,appointmentYear,appointmentTimeHours, patients );
    }*/
    
   
    
    
    
}
