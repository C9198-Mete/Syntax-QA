package homework11;

public class Task2 {
    public static void main(String[] args) {
        Task2 isEven=new Task2();
        System.out.println(isEven.num(4));

    }


    String num(int num){
        if (num%2==0){
            return num+" is even";
        }else {
            return num+" is odd";
        }
    }
}
