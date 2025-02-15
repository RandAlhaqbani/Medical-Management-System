
/*package javaproject;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javaproject.Clinic;
import javaproject.Services;
public class FileRead {
    
   
public void readClinics() {
    
    
        ObjectInputStream ois = null;
        try {
            System.out.println("Reading data from file....");
            ois = new ObjectInputStream(new FileInputStream(new File("clinics.ser")));

            while (true) {
                try {
                    Services clinic = (Services) ois.readObject();
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
    
    
  
}*/
