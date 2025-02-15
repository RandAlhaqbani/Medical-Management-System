
package javaproject;
import java.io.Serializable;

public abstract class person implements Serializable {
    
  private Name Name;
  private int id;
  private int age;
  private String gender;


    public Name getName() {
        return Name;
    }

    public void setName(Name Name) {
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

   

    @Override
    public String toString() {
     return String.format("%s%n Persone Age:%d%n Persone ID:%d%n Persone gender:%s%n ", Name.toString(),age ,id , gender  );
    }
//Full constracter
    //هنا عدلت على الاسم حطيته كومنت عشان الاكسبشن
    public person(Name Name, int id,int age , String gender) {
       this.Name = Name;
        this.id = id;
        this.age=age;
        this.gender = gender;
       
    }
    //هذي الميثود سويتها جديده للطباعه
 /* public void display(){
    System.out.println("Id"+id);
    System.out.println("Age"+age);
    System.out.println("Gender"+gender);
    //هنا استعملت التراي و الكاتش للنيم
      try{
    Name.toString();
}catch(NullPointerException ex){
      System.err.println("No Name ");
} */ 
  
   
 
  //Default constracter  

    public person() {
       
    }
   
    

}
