package class11;

import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {
        int [][] matrix={{10,20,30},{40,50,60,25,55},{70,80,90,100}};

        System.out.println(matrix[1][3]);// output is 25
        System.out.println(Arrays.toString(matrix[0]));
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(matrix[0][i]);
        }


    }
}
