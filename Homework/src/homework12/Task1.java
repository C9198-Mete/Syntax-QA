package homework12;

public class Task1 {

    int sumArr(int[] arr){
        int sum=0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[]arr={2,4,6,8,9,21};
        //System.out.println(sumArr(arr)); we should create a static method
        Task1 task1=new Task1();
        System.out.println(task1.sumArr(arr));
    }
}
