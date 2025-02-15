
package javaproject;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileWriter;

public class Write {
    void saveData(ArrayList<Clinic> clinics) {
        ObjectOutputStream oos = null;
        try {
            FileWriter fw=new FileWriter(".\\ClinicData.txt");

            for (Clinic clinic : clinics) {
                fw.write(clinic.toString());
            }
            fw.close();
            System.out.println("All data saved! in file {ClinicData.txt}");
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
}
