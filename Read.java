
package javaproject;
import java.io.*;
import java.util.*;

public class Read {


public class FileReader {

    private Scanner input;

    public void openFile() {
        try {
            input = new Scanner(new File("clinics.ser"));
        } catch (FileNotFoundException ex) {
            System.err.println("Error opening or creating file.");
            System.exit(1);
        }
    }

    public void readRecords() {
        try {
            while (input.hasNext()) {
                System.out.println(input.nextLine());
                System.out.println("One record read successfully");
            }
        } catch (NoSuchElementException ex) {
            System.err.println("File improperly formed.");
            input.close();
            System.exit(1);
        } catch (IllegalStateException ex) {
            System.err.println("Error reading from file.");
            System.exit(1);
        }
    }

    public void closeFile() {
        if (input != null) {
            input.close();
        }
    }
}
}
