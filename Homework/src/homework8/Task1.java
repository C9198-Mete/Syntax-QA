package homework8;

public class Task1 {
    public static void main(String[] args) {
        int sum=0;
        int[][] nums={{12,54,55},{86,76,99},{25,92,96}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum+=nums[i][j];
            }
        }
        System.out.println(sum);

    }
}
