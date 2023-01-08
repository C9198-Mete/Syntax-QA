package homework4;

import java.util.Scanner;

public class Hw8 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your operations +,-,*,/");
        char opr=input.next().charAt(0);
        System.out.println("Please enter first number");
        double num1=input.nextDouble();
        System.out.println("Please enter second number");
        double num2=input.nextDouble();


        switch (opr){

            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid Operator");

        }
    }
}
