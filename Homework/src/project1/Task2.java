package project1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cntry = new String[5];
        System.out.println("Please enter the names of 5 countries:");
        for (int i = 0; i < cntry.length; i++) {
            cntry[i] = input.nextLine();
        }

        for (int i = 0; i < cntry.length; i++) {
            String country = cntry[i];
        }
    }
}
