
package javaproject;

//this class need's to rethink about it...
public class Nurse extends HospitalMembers {

    public Nurse() {
    }

    public Nurse(double salary, double expertYears, String spicialty, Name name, int id, int age, String gender) {
        super(salary, expertYears, spicialty, name, id, age, gender);
    }
public String toString(){
    return String.format("%s",super.toString());
}
  

   
    

   
   
    
}
