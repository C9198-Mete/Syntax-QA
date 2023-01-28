package class15;

public class Mpractice4 {
    public static void main(String[] args) {
        Mpractice4 nums=new Mpractice4();
        System.out.println(nums.max(34,45));

    }

    int max(int num1,int num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }
}
