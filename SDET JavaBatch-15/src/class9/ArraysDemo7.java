package class9;

public class ArraysDemo7 {
    public static void main(String[] args) {

        int sumEven=0;
        int []numbers=new int[5];
        numbers[0]=45;
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;
        for (int i = 0; i < numbers.length; i++) {
            if (i%2==0){
                sumEven+=numbers[i];
            }
        }
        System.out.println(sumEven);

        int sum2=0;
        int[] nums2={10,20,30,4,5,6,7,80};
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i]%2==0){
                sum2+=nums2[i];
            }
        }
        System.out.println(sum2);
        }
    }

