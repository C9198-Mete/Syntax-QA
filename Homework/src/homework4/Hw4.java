package homework4;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month=input.nextLine().toLowerCase();


        if (month.equals("june")||(month.equals("july"))||(month.equals("august"))){
            System.out.println("season=Summer");
        }else if (month.equals("september")||(month.equals("october"))||(month.equals("november"))){
            System.out.println("season=Fall");
        }else if (month.equals("december")||(month.equals("january"))||(month.equals("february"))){
            System.out.println("season=Winter");
        }else {
            System.out.println("season=Spring");
        }
    }
}
