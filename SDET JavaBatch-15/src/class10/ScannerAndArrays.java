package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] nums=new int[5];


//  Below code manually store numbers in array
//        nums[0]=40;
//        nums[1]=50;
//        nums[2]=60;
//        nums[3]=70;
//        nums[4]=80;

//  Below code take and store , but it's long way
//        nums[0]= input.nextInt();
//        nums[1]= input.nextInt();
//        nums[2]= input.nextInt();
//        nums[3]= input.nextInt();
//        nums[4]= input.nextInt();

//  Below code is the best way

        for (int i = 0; i < nums.length; i++) {
            nums[i]=input.nextInt();
        }

        System.out.println(Arrays.toString(nums));

    }
}
