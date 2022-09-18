package DesignPatterns_Singleton;

class Singleton{
     private static Singleton singleton=new Singleton();


    public Singleton(){  //Constructer process
        System.out.println("SingletonConstucter. Created a object ");
    }


    public static Singleton getInstance(){
        System.out.println("getInstance. Created a object");
        return singleton;
    }
}

public class Entry {
    public static void main(String[] args) {

        Singleton singletonObject1=Singleton.getInstance();
        Singleton singletonObject2=Singleton.getInstance();

        if (singletonObject1==singletonObject2) System.out.println("Bu nesneler aynı");
        else System.out.println("Aynı değil");







    }
}
