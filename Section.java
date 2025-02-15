
package javaproject;


public class Section {
     private String sectionName;
     private String sectionBulding;
     private int sectionFloor;

    public Section(String sectionName, String sectionBulding, int sectionFloor) {
        this.sectionName = sectionName;
        this.sectionBulding = sectionBulding;
        this.sectionFloor = sectionFloor;
    }

     
     
     
     
    public String getSectionName() {
        
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionBulding() {
        return sectionBulding;
    }

    public void setSectionBulding(String sectionBulding) {
        this.sectionBulding = sectionBulding;
    }

    public int getSectionFloor() {
        return sectionFloor;
    }

    public void setSectionFloor(int sectionFloor) {
        this.sectionFloor = sectionFloor;
    }
   
     
     
     
}
