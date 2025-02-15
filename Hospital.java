
package javaproject;
import javaproject.Clinic;
public interface Hospital {
    
  public static final String HospitalName="Princess Nourah Hospital";
  public static final int MAX_CLINIC=10;
  
  public abstract void displayClinic();
 
  public abstract void newAppointment();
  
  public abstract void showAppointmentInfo();
  
  public abstract void cancellAppointment();
  
  public abstract Clinic getClinicById(int appontmentNum );

  //read and save data to fill methodes need to be 

  
  


        
          }




