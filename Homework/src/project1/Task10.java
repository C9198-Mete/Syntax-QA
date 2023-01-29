package project1;

public class Task10 {
    public static void main(String[] args) {

        int[] numbers={21,33,55,53,56,2};
        int max = numbers[0];
        int max2 = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max2=max;
                max = numbers[i];
            }

        }
        System.out.println("Second largest number is "+max2);


    }
}
