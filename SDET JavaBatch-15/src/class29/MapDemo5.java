package class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Matt");
        studentsMap.put(2,"John");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Saba");
        studentsMap.put(6,"Nezir");
        studentsMap.put(7,"Bahar");

        Set<Integer> keys=studentsMap.keySet();
        keys.removeIf(x ->x >2);
        System.out.println(studentsMap);
    }
}
