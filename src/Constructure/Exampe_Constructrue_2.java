package Constructure;

class User{

    String name;
    int age;

    public User(){
        //Parameterless Constructer
        System.out.println("Parametless Const Started ");
    }

    public User(String name, int age){
        System.out.println("User Name : "+name);
        System.out.println("User Age : "+age);
    }


}

public class Exampe_Constructrue_2 {
    public static void main(String[] args) {

            User user =new User();
        System.out.println("Name : " + user.name);
        System.out.println("Age : " + user.age);

        System.out.println("*********************************" +
                "");

        String name ="Gergedan";
        int age=23;

        User user1=new User(name,age);


    }
}
