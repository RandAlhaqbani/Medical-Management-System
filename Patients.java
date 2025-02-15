
package javaproject;

import java.util.InputMismatchException;


public class Patients extends person {
    private int fileNum;
    private String bloodType;
   // private String diseasType;
   // private String prescription;
    // default constracter
    public Patients(){
        
    }
//full constracter

    public Patients(int fileNum, String bloodType,Name name, int id, int age, String gender) {
        super(name, id, age, gender);
        this.fileNum = fileNum;
        this.bloodType = bloodType;
       // this.diseasType = diseasType;
       // this.prescription = prescription;
    }
   
    public void display(){
        try{
        System.out.println("Patient Info:");
        System.out.println("Name:"+getName());
            System.out.println("AGE:"+getAge());
        System.out.println("File Number:"+getFileNum());
        System.out.println("Blood Type:"+getFileNum());
     //   System.out.println("Diseas Type:"+getDiseasType());
        }catch(InputMismatchException ep){
             System.err.println("There is no patient yet");
             }
    }
        

    public int getFileNum() {
        return fileNum;
    }

    public void setFileNum(int fileNum) {
        this.fileNum = fileNum;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

  //  public String getDiseasType() {
   //     return diseasType;
   // }

   // public void setDiseasType(String diseasType) {
   //     this.diseasType = diseasType;
   // }

  //  public String getPrescription() {
 //       return prescription;
  //  }

  //  public void setPrescription(String prescription) {
  //      this.prescription = prescription;
  //  }

    @Override
    public String toString() {
        return String.format("%s%nFile Number: %d%n Blood Type:%s%n DiseasType:%s%n Prescription:%s%n ",super.toString(),fileNum, bloodType/*,diseasType,prescription */);
    
    

}
}