package project1;

public class Task9 {
    public static void main(String[] args) {

        int[] numbers = {8, 25, 90, 4, 5};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        int max1=Math.max(2,4);
        int min1=Math.min(5,8);
        System.out.println(max1);
        System.out.println(min1);



    }
}
