package Constructure;

public class Example_Constructure {

        public static void main(String[] args) {
            CreatAHuman creatAHuman=new CreatAHuman();
            //function
            String name=creatAHuman.name="Alieren";
            String surname=creatAHuman.surname=" Dasdemir";
            String country=creatAHuman.country=" TR ";
            int age=creatAHuman.age=20;



            System.out.println(creatAHuman.name + creatAHuman.surname + creatAHuman.country + creatAHuman.age);

            //method
            System.out.println(creatAHuman.isNameEmpty(name));
            System.out.println(creatAHuman.isSurnameEmpty(surname));
            System.out.println(creatAHuman.isCountryEmpty(country));
            System.out.println(creatAHuman.ageBiggerThaneighteen(age));
        }

        public static class CreatAHuman{
            String name;
            String surname;
            String country;
            int age;

            public CreatAHuman() {
                System.out.println("Constructer : Created A Human");
            }

            public boolean isNameEmpty(String name){
                if (this.name.length()==0) return true;
                else return false;
            }
            public  boolean isSurnameEmpty(String surname){
                if (this.surname.length()==0) return true;
                else return false;
            }

            public  boolean isCountryEmpty(String country){
                if (this.country.length()==0) return true;
                else return false;
            }

            public boolean ageBiggerThaneighteen(int age){
                if (this.age > 18) return true;
                else return false;
            }
        }
}
