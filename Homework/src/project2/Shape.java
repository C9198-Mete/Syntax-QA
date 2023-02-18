package project2;

import java.util.Scanner;

public interface Shape {

    double pi=3.14;
    void calculateArea(double r);

    void calculatePerimeter(double r);

}

class Circle implements Shape{


    @Override
    public void calculateArea(double r) {
        System.out.println("Area of Circle:"+(pi*r*r));

    }

    @Override
    public void calculatePerimeter(double r) {
        System.out.println("Perimeter of Circle:"+(2*pi*r));

    }


}

class Square implements Shape{

    @Override
    public void calculateArea(double a) {
        System.out.println("Area of Square:"+(a*a));

    }

    @Override
    public void calculatePerimeter(double a) {
        System.out.println("Perimeter of Square:"+(4*a));

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the r for circle");
        double r=input.nextDouble();
        System.out.println("enter the side of square");
        double a=input.nextDouble();
        Shape [] arr={new Circle(),new Square()};
        for (int i = 0; i < arr.length; i++) {
            if (i==0){
                Shape ar=arr[i];
                ar.calculatePerimeter(r);
                ar.calculateArea(r);
            }else {
                Shape ar=arr[i];
                ar.calculatePerimeter(a);
                ar.calculateArea(a);
            }

        }
    }
}
