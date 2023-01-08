package homework4;

import java.util.Scanner;

public class Hw7 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your country");
        String country=input.nextLine().toLowerCase();

        if (country.equals("turkey")){
            System.out.println("Your language is Turkish");
        }else if (country.equals("england")) {
            System.out.println("your language is English");
        }else if (country.equals("germany")){
            System.out.println("Your language is German");
        }else if (country.equals("france")){
            System.out.println("Your language is French");
        }

        System.out.println("Please enter your grade");
        char grade=input.next().charAt(0);
        char gr=Character.toUpperCase(grade);

        switch (gr){

            case 'A':
                System.out.println("A=Excellent");
                break;
            case 'B':
                System.out.println("B=Good");
                break;
            case 'C':
                System.out.println("C=Average");
                break;
            case 'D':
                System.out.println("D=Bad");
                break;
            default:
                System.out.println("Not Acceptable");

        }


    }
}
