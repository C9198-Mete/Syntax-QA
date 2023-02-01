package homework11;

public class Task1 {

    public static void main(String[] args) {
        Task1 largest=new Task1();
        System.out.println(largest.larger(34,45));

    }

    int larger(int num1,int num2){
        if(num1>num2){
            return num1;
        } else {
            return num2;
        }
    }
}
