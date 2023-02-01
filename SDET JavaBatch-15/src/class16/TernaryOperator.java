package class16;

public class TernaryOperator {
    public static void main(String[] args) {
        int num=0;

        /*if(3>2){
            num=10;
        }else {
            num=20;
        }
        System.out.println(num);*/

        num=(3>2) ? 10:20;
        num=(3>2) ? (4<5) ? 15:65:20;
        System.out.println(num);
    }
}
