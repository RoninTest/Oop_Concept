package DesignPatterns_Singleton;

import com.company.Main;

class ThreadedLazySingleton{
    private static ThreadedLazySingleton threadedLazySingleton;
    public static int counter;

    private ThreadedLazySingleton(){
        counter++;
    }

    public static ThreadedLazySingleton getInstance(){
        synchronized (ThreadedLazySingleton.class){
            if(threadedLazySingleton==null){
                threadedLazySingleton = new ThreadedLazySingleton();
            }
        }
        return threadedLazySingleton;
    }
}

public class Lazy_Singleton_MultiThread extends Thread{
    public static void main(String[] args) {

        ThreadedLazySingleton singleton;

        for(int i=0; i<10000; i++){
            new Lazy_Singleton_MultiThread().start();
        }

        System.out.println("Toplam Nesne Sayısı : "+ThreadedLazySingleton.counter);
    }

    @Override
    public void run(){

        ThreadedLazySingleton threadedLazySingleton = ThreadedLazySingleton.getInstance();
    }
}
