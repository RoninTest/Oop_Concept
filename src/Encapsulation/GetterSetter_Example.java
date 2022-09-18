package Encapsulation;

class User2{

    private int age;

    public User2(int age){
        this.age=age;
    }

    public int getAge(){
        System.out.println("Customer Age : ");
        return age;
    }

    public void setAge(int age){
        if (age<0)
            this.age=18;
        else
            this.age=age;
    }
}

public class GetterSetter_Example {
    public static void main(String[] args) {
        User2 user2=new User2(23);
        System.out.println("Yas : " + user2.getAge());
        user2.setAge(-24);
        System.out.println("New Age : " + user2.getAge());
    }
}
