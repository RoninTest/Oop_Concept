package Constructure;

class  Usersss{

    String name;
    String country;
    String birthDate;
    int age;

   public Usersss(String name, String country,String birthDate, int age){

       this(name); // başka bir constructure çağrımı  .. Farklı bir contr çağırırken bunu başa yazmalısın.
       this.country=country;
       this.birthDate=birthDate;
       this.age=age;

   }

   public Usersss(String name){ // farklı constructor
       this.name=name;
   }



}

public class Nested_Constructor {

    public static void main(String[] args) {

    }
}
