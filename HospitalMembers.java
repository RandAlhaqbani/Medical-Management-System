
package javaproject;

// this class might be abstract class beacuse we don want to make object from it
public abstract class HospitalMembers extends person {
    
    private double salary;
    private double expertYears;
    private String spicialty;
    
    // default constracter

    public HospitalMembers() {
    }
 

   // public double printsalary(){

    public HospitalMembers(double salary, double expertYears, String spicialty, Name name,int id, int age, String gender) {
        super(name, id, age, gender);
        this.salary = salary;
        this.expertYears = expertYears;
        this.spicialty = spicialty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getExpertYears() {
        return expertYears;
    }

    public void setExpertYears(double expertYears) {
        this.expertYears = expertYears;
    }

    public String getSpicialty() {
        return spicialty;
    }

    public void setSpicialty(String spicialty) {
        this.spicialty = spicialty;
    }

    @Override
    public String toString() {
        return String.format("%s%n Salary:%.2f%n Expert Years:%.2f%n Spicialty:%s%n",super.toString(), salary , expertYears , spicialty);
    }
      
        
   
    
}
