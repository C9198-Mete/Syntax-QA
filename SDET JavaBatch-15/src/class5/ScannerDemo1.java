package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main (String[] args){

        Scanner scan=new Scanner(System.in);
        double weight;

        System.out.println("Please enter your age");
        int age = scan.nextInt();
        System.out.println("your age is "+ age);

        System.out.println("Please enter your weight");
        weight= scan.nextDouble();
        System.out.println("your weight is "+ weight);
        System.out.println("Are you hungry");
        boolean hungry= scan.nextBoolean();
        System.out.println("hungry "+ hungry);


        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);
        gender=Character.toUpperCase(gender);   // if you want to make uppercase a char
        System.out.println("Your gender is "+ gender);


        System.out.println("Please enter your name");
        String name=scan.next();
        System.out.println("Your name is "+ name);


        scan.nextLine();  // Trick to make nextline method work after have used any
        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+ fullName);
        scan.close(); // Good practice


    }
}
