package class26;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {

        ArrayList<String> names =new ArrayList<>();
        names.add("Matt");
        names.add("Fizzy");
        names.add("Savo");
        names.add("Sam");
        names.add("Urwa");
        names.add("Tarik");

        names.remove("Sam");
        names.remove(2);

        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Daria"));

        names.set(3,"Zafar");
        System.out.println(names);
        System.out.println(names.indexOf("Zafar"));


    }
}
