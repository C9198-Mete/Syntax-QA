package class7;

public class ForLoops {
    public static void main(String[] args) {

    /*
    * prints number from 0 to 9
    */

        int num=0;
        while (num<10){
            System.out.println(num);
            num++;
        }

        for (int num2=0;num2<10;num2++){
            System.out.println(num2);
        }

        for (int i=1;i<=20;i++){
            if (i%2!=0){
                System.out.println(i);
            }

        }


    }
}
