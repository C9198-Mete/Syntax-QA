package class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Write start point");
        int num1=input.nextInt();
        System.out.println("Write end point");
        int num2=input.nextInt();
        int odd=0;
        int even=0;
        for (int i = num1; i <= num2; i++) {
            if (i%2==0){
                even+=i;
            }else {
                odd+=i;
            }
        }
        System.out.println("Sum of the even number is "+even);
        System.out.println("Sum of the odd number is "+odd);
    }
}
