package AbstractClasses;

abstract class User{

    abstract void showInfo(); //abstract method there is no in a piece of code.. PremiumUser will override and use it at will.

    void calculatePrice(){  //tangible method  // it may have some piece of code. PremiumUser will override and use it at will.
        System.out.println("İndirim Hesapla");
    }

}

class PremiumUser extends User{

    @Override
    void showInfo() {
        System.out.println("Show the User Info");
    }

    @Override
    void calculatePrice() {
        super.calculatePrice();
        System.out.println("Calculate Discount and Additional Process");
    }
}


public class Entry {

    public static void main(String[] args) {

        PremiumUser premiumUser=new PremiumUser();
        premiumUser.showInfo();
        premiumUser.calculatePrice();

    }
}
