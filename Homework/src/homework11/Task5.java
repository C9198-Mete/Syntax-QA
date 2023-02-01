package homework11;

public class Task5 {
    public static void main(String[] args) {

        Task5 task5=new Task5();
        System.out.println(task5.isPrime(13));

    }

    boolean isPrime(int num){
        if (num>1){
            for (int i = 2; i <num ; i++) {
                if (num%i==0){
                    return false;
                }
            }
        }else {
            return false;
        }
        return true;
    }
}
