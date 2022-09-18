package Inheritance;

class MarketUsers{
    private String name;

    public void Method(){
        System.out.println("Hello I'm a method where in MarketUsers");
    }
}

class Premium_MarketUsers extends MarketUsers{


    @Override
    public void Method() {
        System.out.println("Hello again, I'm a method where Premium_MarketUsers");
    }

    /* super.Method();
    @Override
    public void Method() {
        super.Method();
    }
     */
}


public class Inheritance_MethodOverriding {
    public static void main(String[] args) {

        Premium_MarketUsers premium_marketUsers=new Premium_MarketUsers();
        premium_marketUsers.Method();

    }
}
