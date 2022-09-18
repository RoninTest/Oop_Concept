package Inheritance;

class User{
    private String name;
    private int age;

    public User (String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("***Parent's Constructor worked.**");
    }
}

class PremiumUser extends User{

    public PremiumUser(String name, int age) {
        super(name, age);  //super() methodu ile SuperClass'taki Cnstructor çağrıldı.
        System.out.println("***Child's Constructor worked.***");
    }
}

public class Inheritance_Project {
    public static void main(String[] args) {

        PremiumUser premiumUser=new PremiumUser("Alieren",35);

    }
}
