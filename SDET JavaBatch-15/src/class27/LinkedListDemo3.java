package class27;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {

        long startTime=System.currentTimeMillis();

        LinkedList<String> numbers=new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(0,"Test");

        }

        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);


        long sTime=System.currentTimeMillis();
        ArrayList<String> names=new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            names.add(0,"Test1");

        }
        long eTime=System.currentTimeMillis();
        System.out.println(eTime-sTime);

    }
}
