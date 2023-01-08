package homework4;

import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter three number");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double num3=input.nextDouble();

        if (num1>num2 && num1>num3){
            System.out.println("The largest number is number1 "+ num1);
        }else if (num2>num1 && num2>num3){
            System.out.println("The largest number is number2 "+ num2);
        }else {
            System.out.println("The largest number is number3 "+ num3);
        }
    }
}
