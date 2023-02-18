package class26;

public class Demo1 {
    public static void main(String[] args) {
        String name="Matt";
        String name1="Zafar";
        String name2="Sarah";

        String[] names={"Hiral","Nima","Laura","Nat"};
        displayNames(names);
        displayNames2(name,name1,name2);



    }

    public static void displayNames(String[] names){
        for (String name:names) {
            System.out.println(name);
        }
    }

    public static void displayNames2(String name,String name1,String name2){
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
    }
}
