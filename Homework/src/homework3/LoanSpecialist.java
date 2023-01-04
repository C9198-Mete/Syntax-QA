package homework3;

import java.util.Scanner;

public class LoanSpecialist {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the amount of loan");
        int loan= input.nextInt();

        if (loan<=200000){
            System.out.println("Yes,you can get the loan");
        }else {
            System.out.println("I'm sorry, you can't get the loan");
        }


    }
}
