package class9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            System.out.println("Apply for credit card");
            String card=input.nextLine();
            if (card.equalsIgnoreCase("yes")){
                break;
            }


        }
    }
}
