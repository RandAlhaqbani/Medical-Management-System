
/*package javaproject;



import javaproject.Clinic;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
        
        
public class FileWriter {
    
   
    public void saveClinics(String fileName , ArrayList<Clinic>list ){
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)));

            for (Clinic clinic : list) {
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
     public void saveAppointment(String fileName , ArrayList<appointment>list ){
        ObjectOutputStream oos = null;
        int count=0;
        
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)));

            for (appointment app : list) {
                oos.writeObject(app);
                count++;
            }
            System.out.println(count+"Appointment is Saved");
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
    
    
    
    
    
    
    
    
}*/

