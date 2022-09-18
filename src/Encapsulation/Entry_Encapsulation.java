package Encapsulation;

class User{

    private int number;  // close to access - Informatin Hiding
    String name1;  //open to access
    public String name2; // open to access
}

public class Entry_Encapsulation {

    public static void main(String[] args) {

        User user=new User();
        user.name1="Alieren";


    }
}
