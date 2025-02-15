package javaproject;

public class pharmacy {

    private Patients patient;
    private String medicineName;
    private String medicineUses;
    private double medicineCost;
    private double bill;

    public pharmacy(Patients patient, String medicineName, String medicineUses, double medicineCost) {
        setPatient(patient);
        setMedicineName(medicineName);
        setMedicineUses(medicineUses);
        setMedicineCost(medicineCost);
    }

    public pharmacy() {
    }

    
    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineUses() {
        return medicineUses;
    }

    public void setMedicineUses(String medicineUses) {
        this.medicineUses = medicineUses;
    }

    public double getMedicineCost() {
        return medicineCost;
    }

    public void setMedicineCost(double medicineCost) {
        this.medicineCost = medicineCost;
    }

    public void checkInsurance(int choice) {

        if (choice == 1 ) {
           
            if(bill>200){
                bill=bill-(bill *0.5);
                
                System.out.println("You'r insurance will cover 50% of your total bill");
                System.out.println("Your total is: "+bill);
            }
            else if(bill<200){
                System.out.println("Sorry your total is lees than 200 Sr");
                System.out.println("You'r insurance dosent cover your bill");
            
                System.out.println("Yout total is:"+bill);
            }
        } else if (choice == 0) {
            System.out.println("Your will be paying for you'r own bill");
          
            System.out.println("Your total is: "+bill);
        }

    }

    //this method need to try it in the main fisrt..
    public double med(int option) {
        medicineCost = 0;
       // System.out.println("******Medicine Bill******");

        switch (option) {       
            case 0: 
            break;
                             //This medicine is used for diabetes.
            
            case 1:
                medicineCost = 27.60;
                medicineName = "NATRILIXSR";
                 bill+=medicineCost;
                System.out.println(medicineName + "    SR: " + medicineCost);

                break;//This medicine is used for the treatment of inflammation and roughness of the joints.
            case 2:
                medicineCost = 36.40;
                medicineName = "Dorofen";
                 bill+=medicineCost;
                System.out.println(medicineName + "    SR: " + medicineCost);
                break;//This medicine is used for  High Blood Pressure.
            case 3:
                medicineCost = 135.95;
                medicineName = "Aprovasc";
                 bill+=medicineCost;
                System.out.println(medicineName + "    SR: " + medicineCost);
                break;//this medicine is used for  an abnormal heartbeat.
            case 4:

                medicineCost = 20.50;
                medicineName = "Normoten";
                 bill+=medicineCost;
                System.out.println(medicineName + "    SR: " + medicineCost);
                break; //This Eye drops is used for dry eyes.
            case 5:

                medicineCost = 144.60;
                medicineName = "Restasis";
                 bill+=medicineCost;
                System.out.println(medicineName + "    SR: " + medicineCost);
                break;//this medicine is used for Acidity and stomach ulcers.
            case 6:

                medicineCost = 88.85;
                medicineName = "Risek";
                 bill+=medicineCost;
                System.out.println(medicineName + "    SR: " + medicineCost);
                break;
            case 7://This medicne is used for headache.

                medicineCost = 6.95;
                medicineName = "Panadol Extra";
                 bill+=medicineCost;
                System.out.println(medicineName + "    SR: " + medicineCost);
            default:
                System.out.println("Sorry The Medicine you'r looking for is not Available");
        }
      //  System.out.println("********Thank You********");
        //main
       
        // checkInsurance(choice);
             
        return bill+=medicineCost;
    }

    public void medInfo() {
        System.out.println("                                                             ****Medicine Information****                   ");
        System.out.println("                                                           ");
        System.out.println("  Medicine Name:            |     Indications for use of the treatment:                                                      |   Medicine price :       ");
        System.out.println("                            |                                                                                                |                              ");
        System.out.println(" 01.NATRILIXSR              |     This medicine is used for diabetes.                                                        |      27.60  SR                     ");
        System.out.println("                            |                                                                                                |                          ");
        System.out.println(" 02.Dorofen                 |     This medicine is used for the treatment of inflammation and roughness of the joints.       |      36.40  SR        ");
        System.out.println("                            |                                                                                                |                       ");
        System.out.println(" 03.Aprovasc                |     This medicine is used for  High Blood Pressure.                                            |      135.95 SR        ");
        System.out.println("                            |                                                                                                |                    ");
        System.out.println(" 04.Normoten                |     This medicine is used for  an abnormal heartbeat.                                          |      20.50  SR ");
        System.out.println("                            |                                                                                                |                     ");
        System.out.println(" 05.Restasis                |     This Eye drops is used for dry eyes.                                                       |      144.60 SR");
        System.out.println("                            |                                                                                                |              ");
        System.out.println(" 06.Risek                   |     This medicine is used for Acidity and stomach ulcers.                                      |      88.85  SR  ");
        System.out.println("                            |                                                                                                |                    ");
        System.out.println(" 07.Panadol Extra           |     This medicne is used for headache.                                                         |      6.95   SR ");
        System.out.println("                                                                                                                                                  ");
        System.out.println("______________________________________________________________________________________________________________________________________________________________________");
    }

}
