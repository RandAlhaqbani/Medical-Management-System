
package javaproject;


public class internStudent extends person {
   
 private Doctor doctor;   
 private String UniversityName;
//Full constracter
    public internStudent(Doctor doctor, String UniversityName, Name name, int id, int age, String gender) {
        super(name, id, age, gender);
       setDoctor(doctor);
       setUniversityName(UniversityName);
        
    }
    
    public void display(){
        System.out.println("Intern Student Name:"+getName());
        System.out.println("Doctor in charge of the student"+ doctor.getName());
    }
//default constracter
    public internStudent() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public void setUniversityName(String UniversityName) {
        this.UniversityName = UniversityName;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n Univesity Name:%s%n",super.toString(), doctor.toString() , UniversityName );
    }
 
 
 
    
}
