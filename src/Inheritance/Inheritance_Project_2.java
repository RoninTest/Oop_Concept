package Inheritance;

class Shop_User{

    private String name;
    private String country;
    private int age;

    public Shop_User(String name,String country,int age){

        this.name=name;
        this.country=country;
        this.age=age;

    }

    public void showShop_User(){
        System.out.println("User Name : " + name);
        System.out.println("User Country : " + country);
        System.out.println("User Age : " + age);
    }

}

class PremiumUsers extends Shop_User {

    private double premiumPrice;

    public PremiumUsers(String name, String country, int age,double premiumPrice){
        super(name,country,age);
        this.premiumPrice=premiumPrice;
    }

    public void calculatePriceAfterCoupon(String coupon){
        if(coupon.equals("AT8234")){
            System.out.println("Pay amount with discount : " + 250.99 + "TL");
        }
        else if(coupon.equals("CB32T5")){
            System.out.println("Pay amount with discount : " + 344.95+"TL");
        }
        else{
            System.out.println("Geçersiz indirim kuponu");
            System.out.println("İndirim sonucu ödenecek olan tutar : " + 599.99 + "TL");
        }
    }

}
class NormalUsers extends Shop_User{


    public NormalUsers(String name, String country, int age) {
        super(name, country, age);
    }

    @Override
    public void showShop_User() {
        super.showShop_User();
    }
}

public class Inheritance_Project_2 {

    public static void main(String[] args) {

        Shop_User shop_user=new Shop_User("Ali","TR",33);
        shop_user.showShop_User();

        PremiumUsers premiumUsers=new PremiumUsers("Alieren","TR",33,599.99 );
        NormalUsers normalUsers=new NormalUsers("Muge","TR",27);

        premiumUsers.calculatePriceAfterCoupon("AT8234");
        System.out.println(" ");
        premiumUsers.showShop_User();
        System.out.println(" ");

        normalUsers.showShop_User();
    }
}
