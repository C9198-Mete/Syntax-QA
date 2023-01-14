package class8;

public class NestedLoops9 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            if (i==0){
                for (int j =0 ; j <=5; j++) {
                    System.out.print(j+" ");
                }
            } else if (i==1) {
                for (int j =0 ; j <=10; j+=2) {
                    System.out.print(j+" ");
                }

            }else {
                for (int j =0 ; j <=15; j+=3) {
                    System.out.print(j+" ");
                }
            }

            System.out.println();
        }
    }
}
