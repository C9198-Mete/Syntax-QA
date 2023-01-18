package class10;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int[] nums={1,2,3,4,5};
        System.out.println(nums[4]);


        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("****************");

        for (int i: nums) {
            System.out.println(i);
        }


    }
}
