package javaproject;

public class Doctor extends HospitalMembers {

    private double roomNum;

    // default constracter
    public Doctor() {
    }
//Full constracter

    public Doctor(double roomNum, double salary, double expertYears, String spicialty, Name name, int id, int age, String gender) {
        super(salary, expertYears, spicialty, name, id, age, gender);
        this.roomNum = roomNum;
    }

    public void display() {
        System.out.println("Doctor Name:" + getName());
        System.out.println("Doctor spicialty:" + getSpicialty());
        System.out.println("Doctor Room Number:" + getRoomNum());
    }

    public double getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(double roomNum) {
        this.roomNum = roomNum;
    }

    @Override
    public String toString() {
        return String.format("%s%n Docter Room Number:%.2f%n", super.toString(), roomNum);
    }

}
