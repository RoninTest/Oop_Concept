package DesignPatterns_Singleton;

class Singleton2{
    private static Singleton2 singleton2=new Singleton2();

    private Singleton2(){

    }

    public static Singleton2 getSingleton2(){
        return singleton2;
    }
}

class LazySingleton2{
    private static LazySingleton2 singleton2;

    private LazySingleton2(){

    }

    public static LazySingleton2 getInstance(){
        if (singleton2 == null){
            singleton2=new LazySingleton2();
        }
        return singleton2;
    }
}

class ThreadLazySingleton2{
    private static ThreadLazySingleton2 singleton2;
    private ThreadLazySingleton2(){

    }

    public static ThreadLazySingleton2 getInstance(){
        synchronized (ThreadLazySingleton2.class){
            if(singleton2==null) singleton2 =new ThreadLazySingleton2();
        }
        return singleton2;
    }
}

class DoubleCheckedLockingSingleton{
    private static DoubleCheckedLockingSingleton singleton;

    private DoubleCheckedLockingSingleton(){

    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if(singleton==null){
            synchronized(DoubleCheckedLockingSingleton.class){
                if(singleton==null){
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }
}

public class Main {
    public static void main(String[] args) {
                Singleton2 singleton2=Singleton2.getSingleton2();
                LazySingleton2 lazySingleton2=LazySingleton2.getInstance();
                ThreadLazySingleton2 threadLazySingleton2=ThreadLazySingleton2.getInstance();
                DoubleCheckedLockingSingleton doubleCheckedLockingSingleton=DoubleCheckedLockingSingleton.getInstance();

        if (singleton2 == singleton2) {
            System.out.println("Bu nesneler birebir ile aynı");
        } else {
            System.out.println("Bu nesneler farklı");

        }

        if (lazySingleton2 == lazySingleton2) {
            System.out.println("Bu nesneler birebir ile aynı");
        } else {
            System.out.println("Bu nesneler farklı");

        }

        if (threadLazySingleton2 == threadLazySingleton2) {
            System.out.println("Bu nesneler birebir ile aynı");
        } else {
            System.out.println("Bu nesneler farklı");

        }
        if (doubleCheckedLockingSingleton == doubleCheckedLockingSingleton) {
            System.out.println("Bu nesneler birebir ile aynı");
        } else {
            System.out.println("Bu nesneler farklı");

        }
    }
}
