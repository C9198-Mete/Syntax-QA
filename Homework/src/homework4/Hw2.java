package homework4;

import java.util.Scanner;

public class Hw2 {
public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter day number");
        int day=input.nextInt();

        if (day<=5){
        System.out.println("it is a weekday");
        } else if (day>5 && day<=7) {
            System.out.println("It is a weekend");

        }else {
            System.out.println("Invalid day");
        }
        }
        }
