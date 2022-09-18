package Inheritance;

class Customer_customer{

    private String name;
    private int age;

    public Customer_customer(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}

class Premium_User extends Customer_customer{

    private String country; //Extra variable


public Premium_User(String name){
    super(name);

}
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override //It's not mandatory
    public String getName() {
    //this unchecked operation
        return super.getName();
    }
    public String nameSperaed(String name1){
        String name2=name1;
        System.out.println(name2.toUpperCase());
        return name2;
    }
}

public class Inheritance_Access {

    public static void main(String[] args) {

        Customer_customer customer_customer=new Customer_customer("Alieren1");
        System.out.println(customer_customer.getName());
        customer_customer.setName("Muge1");
        System.out.println(customer_customer.getName());

        Premium_User premium_user=new Premium_User("Alieren2");
        System.out.println(premium_user.getName());
        premium_user.setName("Muge2");
        System.out.println(premium_user.getName());

        Premium_User premium_user1=new Premium_User("");
        premium_user1.nameSperaed("muge & alieren");


    }
}
