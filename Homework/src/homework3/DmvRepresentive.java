package homework3;

import java.util.Scanner;

public class DmvRepresentive {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please, enter your age");
        int age=input.nextInt();

        if (age>=18){
            System.out.println("Ok, you can get a driver license");
        }else {
            System.out.println("I'm sorry, you can get a learners permit only");
        }
    }
}
