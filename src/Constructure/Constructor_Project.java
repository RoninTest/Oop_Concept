package Constructure;

class Kullanici{

    String name;
    String country;
    static int numberOfUser=0;

    public Kullanici(){
        numberOfUser ++;
    }

    public Kullanici(String name,String country){

        this(); // kullanıcı sayısının hesaplandığı const çağrıldı.
        this.name=name;
        this.country=country;
    }

    public void showUserInfo(){
        System.out.println("Kullanıcı Adı : " + this.name);
        System.out.println("Kullanıcı Ülke : " + this.country);
    }
}

public class Constructor_Project {

    public static void main(String[] args) {

        Kullanici kullanici=new Kullanici("Alieren","TR");
        Kullanici kullanici1=new Kullanici("Muge","ABD");
        Kullanici kullanici2=new Kullanici("Ayse","Canada");

        kullanici.showUserInfo();
        System.out.println(" ");
        kullanici1.showUserInfo();
        System.out.println(" ");
        kullanici2.showUserInfo();
        System.out.println("Toplam kullanici sayisi" +Kullanici.numberOfUser);


    }
}
