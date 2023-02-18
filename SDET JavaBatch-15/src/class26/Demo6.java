package class26;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);

        System.out.println(booleans.get(3));
        System.out.println(booleans.get(4));

        for (int i = 0; i <booleans.size(); i++) {
            System.out.println(booleans.get(i));

        }

        int j=0;
        while ( j<booleans.size()){
            System.out.println(booleans.get(j));
            j++;
        }
    }
}
