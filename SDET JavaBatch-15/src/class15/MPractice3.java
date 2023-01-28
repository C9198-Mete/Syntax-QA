package class15;

import java.util.Arrays;

public class MPractice3 {
    public static void main(String[] args) {
        MPractice3 sum=new MPractice3();
        System.out.println(sum.col(new int[]{3, 2, 35}));
    }

    int col(int[]arr){
        int sum=0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
