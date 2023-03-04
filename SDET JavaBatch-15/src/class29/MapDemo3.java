package class29;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<Integer,String> building=new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Lenovo");
        building.put(3,"Apple");
        building.put(4,"Syntax");
        building.put(5,"Facebook");
        building.put(6,"Amazon");
        building.put(7,"Apple");

        System.out.println(building.size());
        building.replace(4,"Samsung");
        building.remove(7);
        System.out.println(building);
    }
}
