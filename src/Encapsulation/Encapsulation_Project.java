package Encapsulation;


class Customer_User{
    private String name;
    private  String country;
    private int age;
    private String birthDate;

    public Customer_User(String name,String country,int age,String birthDate){  //Parameter Const
        this.name=name;
        this.country=country;
        this.age=age;
        this.birthDate=birthDate;
    }

    //Object Behevior
    public void showUserInfo(){
        System.out.println("User Name : " + name);
        System.out.println("User Counrty : " + country);
        System.out.println("User Age : " + age);
        System.out.println("User Birth Date : " + birthDate);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country=country;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public void setBirthDate(String birthDate){
        this.birthDate=birthDate;
    }

}

public class Encapsulation_Project {

    public static void main(String[] args) {

        Customer_User customer_user=new Customer_User("X","X",1,"X");
        Customer_User customer_user1=new Customer_User("Alieren","TR",33,"04.02.1989");

        customer_user.setName("Muge Sevgi");
        customer_user.setCountry("Turkiye");
        customer_user.setAge(34);
        customer_user.setBirthDate("20.11.1996");

        String userName=customer_user.getName();
        String userCountry = customer_user.getCountry();

        System.out.println("User Name : " + userName);
        System.out.println("User Country : " + userCountry);
        System.out.println("User Age : " + customer_user.getAge());
        System.out.println("Kullanıcı Birthday : " + customer_user.getBirthDate());

        System.out.println("************************");
        customer_user1.showUserInfo();



    }
}
