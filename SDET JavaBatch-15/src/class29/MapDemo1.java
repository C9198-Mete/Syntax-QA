package class29;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Matt");
        studentsMap.put(2,"John");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");

        System.out.println(studentsMap);

        System.out.println(studentsMap.get(4));
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(3));
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.containsValue("Matt"));
        System.out.println(studentsMap.containsValue("marcus"));
        System.out.println(studentsMap.remove(1));
        System.out.println(studentsMap);
        studentsMap.replace(2,"Elvis");
        System.out.println(studentsMap);

    }
}
