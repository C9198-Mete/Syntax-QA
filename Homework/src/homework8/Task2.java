package homework8;

public class Task2 {
    public static void main(String[] args) {
        int [][] nums={{23,12,45,66},{70,54,34,11},{99,77,54,32}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j]%2==0){
                    System.out.print(nums[i][j]+" ");
                }

            }

        }

    }
}
