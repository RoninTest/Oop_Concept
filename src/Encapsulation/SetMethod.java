package Encapsulation;

class SetterMethod{

    private int age; //Nesne Özelliği

    public SetterMethod(){ //Dfault Constructor
    }

    public SetterMethod(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
}



public class SetMethod {
    public static void main(String[] args) {

        SetterMethod setterMethod=new SetterMethod(); //Default Constructor
        System.out.println("setterMethod's age : " + setterMethod.getAge());
        setterMethod.setAge(23);
        System.out.println("setterMethod's age : " + setterMethod.getAge());

        SetterMethod setterMethod1=new SetterMethod(30); // Parametreli Const
        setterMethod1.getAge();
        System.out.println("new get setterMethod's age : " + setterMethod1.getAge());
    }
}
