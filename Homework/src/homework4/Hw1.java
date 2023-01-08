package homework4;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your heights");
        int height= input.nextInt();

        if (height<60){
            System.out.println("short");
        } else if (height<=72 && height>=60) {
            System.out.println("medium");
        }else {
            System.out.println("tall");
        }
    }
}
