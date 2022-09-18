package Encapsulation;

class Customers{
    private int age; //Field


    public Customers(int age){ //Ctor
        this.age=age;
    }

    public int getAge(){  //Getter Method
        return age;
    }
}



public class GetMethod {
    public static void main(String[] args) {
        Customers customers= new Customers(23);

        int ageOfObject=customers.getAge();
        System.out.println(ageOfObject);

    }
}
