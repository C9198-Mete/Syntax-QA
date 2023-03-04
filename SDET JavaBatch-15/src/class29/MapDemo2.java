package class29;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {

        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",4.99);
        fruit.put("Banana",3.60);
        fruit.put("Orange",1.99);
        fruit.put("Kiwi",2.95);
        fruit.put("Apple",3.99);
        System.out.println(fruit);
        fruit.put(null,null);
        System.out.println(fruit);

        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("foundation",40.0);
        makeup.put("mascara",70.0);
        makeup.put("eyeliner",12.5);
        makeup.put("Blush-on",12.5);


        HashMap<String,Double> groceries=new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(makeup);
        System.out.println(groceries);




    }
}
