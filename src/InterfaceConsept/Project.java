package InterfaceConsept;


abstract class Userss{

    private String name;
    private String country;
    private int age;

    public Userss(String name,String country,int age){
        this.name=name;
        this.country=country;
        this.age=age;
    }

    abstract void showInfo();

    public String getName(){
        return name;
    }

    public String getCountry(){
        return country;
    }

    public int getAge(){
        return age;
    }
}

class PremiumUser extends Userss{
    private double price;

    public PremiumUser(String name, String country, int age, double price) {
        super(name, country, age);
        this.price=price;
    }


    @Override
    void showInfo() {
        System.out.println("User Name : " + getName());
        System.out.println("User Country : " + getCountry());
        System.out.println("User Age : " + getAge());
        System.out.println("User price : " + getPrice());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    public double getPrice(){
        return price;
    }
}

interface Controller{

    boolean isNameAvaliable(Userss userss);
    boolean isAgeAvailable(Userss userss);
}

class UserController implements Controller{

    @Override
    public boolean isNameAvaliable(Userss userss) {
        if (userss.getName().length() <3 )
            return false;
        else
            return true;
    }

    @Override
    public boolean isAgeAvailable(Userss userss) {
        if (userss.getAge() < 0)
            return false;
        else
            return true;
    }
}



public class Project {

    public static void main(String[] args) {

        PremiumUser premiumUser = new PremiumUser("Alieren", "TR", 33, 255.99);

        System.out.println("User Info");
        premiumUser.showInfo();

        UserController userController=new UserController();

        System.out.println("***User Info is checking...***");

        if(!userController.isNameAvaliable(premiumUser)){
            System.out.println("User Name cannot be less than 3 characters ");
        }else
            System.out.println("OK");
        if (!userController.isAgeAvailable(premiumUser)){
            System.out.println("User Name cannot be less than 0");
        }


    }
}



