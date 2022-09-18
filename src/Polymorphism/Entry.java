package Polymorphism;

class Users{

    private String name;
    private String country;
    private int age;

  public Users(String name, String country,int age){
      this.name=name;
      this.country=country;
      this.age=age;
  }

    public void showUserInfo(){
        System.out.println("User Name : " +name +"\n" +
                "User Country : "+ country + "\n" +
                "User Age : "+ age);
    }
}

class PremiumUser extends Users{

    private double price;

    public PremiumUser(String name,String country,int age, double price) {
        super(name,country,age);
        this.price=price;
    }

    @Override
    public void showUserInfo() {
        super.showUserInfo();
        System.out.println("Ödenen ücret : " + price);
    }
}

class NormalUser extends Users{

    public NormalUser(String name,String country,int age) {
        super(name,country,age);
    }
}


public class Entry {

    public static void showUserInfo(Users u){
        u.showUserInfo();
    }

    public static void main(String[] args) {

        Users users=new Users("User","TR",32);
        Users users1=new PremiumUser("Premium User ","TR",32, 250);
        Users users2=new NormalUser(" Normal User ","TR",32);

        System.out.println("--User Info--"+ "\n");
        showUserInfo(users);
        System.out.println("--User Info--"+ "\n");
        showUserInfo(users1);
        System.out.println("--User Info--"+ "\n");
        showUserInfo(users2);

    }
}
