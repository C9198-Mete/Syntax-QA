package project1;



public class Task3 {
    public static void main(String[] args) {
        int sum=0;

        int [][] nums={{23,4,12,45},{34,89,57,87,66,32,65}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum+=nums[i][j];

            }

        }
        System.out.println(sum);



        }

    }

