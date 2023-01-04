package homework3;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Do you have credit card?(Yes/No)");
        String card=input.nextLine();
        card=card.toUpperCase();
        while (!card.equals("YES") && (!card.equals("NO"))){
            System.out.println("You should enter valid answer.Do you have credit card?(Yes/No)");
            String acard=input.nextLine().toUpperCase();
            card=acard;
        }
        if (card.equals("YES")){
            System.out.println("What is the balance of your card?");
            int balance=input.nextInt();
            if (balance>1000){
                System.out.println("Pay off immediately");
            }else {
                System.out.println("You can spend more");
            }

        }else {
            System.out.println("Would you like to get a credit card?");
        }

    }
}
