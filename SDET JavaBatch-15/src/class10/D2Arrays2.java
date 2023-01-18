package class10;

import java.util.Arrays;

public class D2Arrays2 {
    public static void main(String[] args) {

        int [][] matrix={{2,3,4},{21,45,5},{32,66,23,4,45,765}};
        System.out.println(matrix[2][3]); // output 4

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);

            }

        }


    }
}
