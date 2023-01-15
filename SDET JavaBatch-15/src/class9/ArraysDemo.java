package class9;

public class ArraysDemo {
    public static void main(String[] args) {
        String name="Matt";
        String name2="Ash";
        String name3="Mike";
        String name4="John";
        String name5="George";

        String[] names={"Matt","Ash","Mike","John","George"};

        System.out.println(name2); // Ash
        System.out.println(names[1]); // Ash
        System.out.println(names[0]);// Matt
        System.out.println(names[4]);// George
        //System.out.println(names[20]); You will get an error because there is no name on index 20


        for (int i = 0; i < 5; i++) {
            System.out.print(names[i]+" ");

        }


    }
}
