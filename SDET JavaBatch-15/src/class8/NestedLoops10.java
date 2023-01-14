package class8;

public class NestedLoops10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <=5*i; j+=i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("*********");

        for (int i = 1; i <=3; i++) {
            for (int j = 0; j <=5; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();

        }

    }
}
