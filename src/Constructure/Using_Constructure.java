package Constructure;

class Users{
    String name;
    String country;
    int age;
    String birthday;
    //public Users(String p1,String p2,int p3,String p4)
    public Users(String name,String country,int age,String birthday){

       this.name=name;
       this.country=country;
       this.age=age;
       this.birthday=birthday;
    }

    public Users(){
        System.out.println("Ekstra contructer Method");
    }
}

public class Using_Constructure {
    public static void main(String[] args) {

        Users users=new Users(" Alieren"," TR ",33," 04.02.1989");
        Users users1=new Users();

        System.out.println(users.name + users.country + users.age + users.birthday);

    }

}
