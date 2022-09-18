package OOP_Entry;

class Customer{

    String name;
    String country;
    String birthDate;
    int age;

    public void showBirthDateInfo(String currentDate){
        if(birthDate.startsWith(currentDate))
            System.out.println("Doğum Tarihi :" + (birthDate+" Bugun doğum günün"));
        else
            System.out.println( "Doğum Tarihi : " + birthDate);
    }

    public boolean isNameEmpty(){
        if (name.length() == 0)
            return true;
        else
            return false;

    }
}

public class Oop_Entry_1 {

    public static void main(String[] args) {
//"new" anahtar kelimesi ile nesne yaratıldı.
// Artık bellekte, bu nesne için bir yer ayrılmış oldu.
//User = Nesne üreten sınıfın ismi
// userObject = Üretilen nesnenin ismi
// User() = Nesne oluşturmaya yarayan metot(Constructor).

        Customer customer=new Customer();
        customer.name="Alieren";
        customer.country="TR";
        customer.age=32;
        customer.birthDate="04.02.1989";

        System.out.println(customer.name + customer.country + customer.age + customer.birthDate);

        if (customer.isNameEmpty()){
            System.out.println("UserName is empty");
        }else System.out.println("UserName is not empty");

        String currentDate="02.06";
        customer.showBirthDateInfo(currentDate);



    }
}
