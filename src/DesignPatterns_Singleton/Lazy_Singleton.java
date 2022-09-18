package DesignPatterns_Singleton;

class Creature{
    private static Creature creature;

    private Creature(){
        System.out.println("Creature sınıfında bir nesne üretildi.");
    }

    public static Creature getInstance(){
        if (creature == null){
            creature=new Creature();
        }
        return creature;
    }

}




public class Lazy_Singleton {
    public static void main(String[] args) {

        Creature creature11 = Creature.getInstance();
        Creature creature12 = Creature.getInstance();

        if (creature11 == creature12) {
        System.out.println("Bu nesneler birebir ile aynı");
    } else {
        System.out.println("Bu nesneler farklı");

    }
}
}
