package class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo6 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Matt");
        studentsMap.put(2,"John");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Saba");
        studentsMap.put(6,"Nezir");
        studentsMap.put(7,"Bahar");

        Collection<String> values=studentsMap.values();
        System.out.println(values);
        values.removeIf(x ->x.contains("i"));
        System.out.println(studentsMap);
    }
}
