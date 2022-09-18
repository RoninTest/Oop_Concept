package InterfaceConsept;

interface IUser{
    String name ="User_1";
    int age = 33;

    public static void showInfo(){
        System.out.println("User Name : " + name);
        System.out.println("User Age : " + age);
    }
}



public class Entry {
    public static void main(String[] args) {

        System.out.println("Interface User Name : " + IUser.name);
        System.out.println("Interface User Age : " + IUser.age);
        System.out.println("Interface Informations");
        IUser.showInfo();


    }
}
