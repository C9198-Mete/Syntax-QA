package project1;

public class Task4 {
    public static void main(String[] args) {
        int [][] nums={{23,34,56,21,45},{89,90,88,66,45,},{34,56,12}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j]%2==0){
                    System.out.print(nums[i][j]+" ");
                }

            }

        }
    }
}
