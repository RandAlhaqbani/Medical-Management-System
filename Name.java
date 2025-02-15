
package javaproject;
import java.io.Serializable;
public class Name implements Serializable {
    private String fistName;
    private String middleName;
    private String lastName;
 //Full Constructer
    public Name(String fistName, String middleName, String lastName) {
        this.fistName = fistName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    //default constracter

    public Name() {
    }
    

    @Override
    public String toString() {
        return String.format("Patient Name:%s %s %s ",fistName,middleName,lastName );
    }
    
  
    
    
    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    
}
