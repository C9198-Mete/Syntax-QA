package class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo7 {
    public static void main(String[] args) {


        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"John");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Saba");
        studentsMap.put(6,"Kamil");
        studentsMap.put(7,"Bahar");

        Set<Entry<Integer,String>> entrySet=studentsMap.entrySet();

        entrySet.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));
        System.out.println(studentsMap);

    }
}
