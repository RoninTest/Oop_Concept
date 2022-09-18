package Overloading_Overriding;

class Calculator{
    public int calculateArea(int side){ //Square  //Overloading : Same name but different signature.

        return side*side;
    }

    public int calculateArea(int side1,int side2){ //Rectangel  //Overloading
        return side1*side2;
    } //Same name but different signature.

}

class MathematicalProcesses{
    public int calculatePerimeter(int a,int b,int c){
        return a+b+c;
    }
}

class Calculator2 extends MathematicalProcesses{

    @Override
    public int calculatePerimeter(int a, int b, int c) {
        return super.calculatePerimeter(a, b, c);
    }
}

public class Signature_Notion {

    public static void main(String[] args) {


        Calculator2 calculator2=new Calculator2();
        int number=calculator2.calculatePerimeter(2,3,4);
        System.out.println(number);

        System.out.print("Eren");

    }
}
