package Overloading_Overriding;

class MatProcess{

     public int calculateSquareArea(int side){
        return side * 4;
    }
    public int calculateRectangle(int side1,int side2){
         return 2*(side1 * side2);
    }

    public int calculateTriangle(int side1,int side2,int side3){
         return side1+side2+side3;
    }

}

class Calculators extends MatProcess{

    public int calculateArea(int side){
        return side*side;
    }

    public int calculateArea(int side1, int side2){
        return side1*side2;
    }

    public double calculateArea(int side1, int side2,int side3){
        double u = (side1+side2+side3)/2;
        return Math.sqrt(u*(u-side1)*(u-side2)*(u-side3));
    }

    @Override
    public int calculateSquareArea(int side) {
        return super.calculateSquareArea(side);
    }

    @Override
    public int calculateRectangle(int side1, int side2) {
        return super.calculateRectangle(side1, side2);
    }

    @Override
    public int calculateTriangle(int side1, int side2, int side3) {
        return super.calculateTriangle(side1, side2, side3);
    }
}

public class Project {

    public static void main(String[] args) {
        Calculators calculators=new Calculators();
        System.out.println("Kenar uzunluğu 3 olan kare çevresi : "+ calculators.calculateArea(3));
        System.out.println("Kenar uzunluğu 3 olan kare çevresi : "+ calculators.calculateSquareArea(2));
    }
}
