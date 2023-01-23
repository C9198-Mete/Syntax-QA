package project1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int avrg;
        int[] nums=new int[7];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=input.nextInt();
            sum+=nums[i];

        }

        System.out.println(sum);

    }
}
