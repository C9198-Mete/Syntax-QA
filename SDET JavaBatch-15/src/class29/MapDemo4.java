package class29;

import java.util.HashMap;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {

        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("foundation",40.0);
        makeup.put("mascara",70.0);
        makeup.put("eyeliner",12.5);
        makeup.put("Blush-on",12.5);

        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);

        /*for (String s:allKeys) {
            System.out.println(s);
        }*/

        allKeys.removeIf(x -> x.length()>7);
        System.out.println(allKeys);
        System.out.println(makeup);
    }
}
