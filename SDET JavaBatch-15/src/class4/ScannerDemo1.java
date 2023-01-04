package class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=input.nextLine();
        System.out.println("Please enter your last name");
        String lastName=input.nextLine();
        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("Are you ready for new career");
        boolean ready=input.nextBoolean();
        System.out.println("My name is " + name + " and last name is "+ lastName + " and I'm " + age + " years old and I'm "+ ready );
    }
}
