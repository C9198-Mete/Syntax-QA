package project1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][] nums=new int[3][4];
        int evenSum=0;
        int oddSum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=input.nextInt();
                if (nums[i][j]%2==0){
                    evenSum+=nums[i][j];
                }else {
                    oddSum+=nums[i][j];
                }
            }

        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
