package class11;

public class Example1 {
    public static void main(String[] args) {
        int [][] matrix={{10,20,30},{45,55,66},{30,40,20,10,25}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]%2!=0){
                    System.out.print(matrix[i][j]+" ");
                }

            }
            System.out.println();

        }
    }
}
