package project1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        boolean isPrime=true;
        if (num<2){
            System.out.println(num+" is not a prime");
        }else {
            for (int i = 2; i <num ; i++) {
                if (num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println(num+" is a prime");
        }else {
            System.out.println(num+" is not a prime");
        }

    }
}
