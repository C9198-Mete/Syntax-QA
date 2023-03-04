package class29;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Task1 {
    public static void main(String[] args) {

        Map<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington");
        countries.put("England","London");
        countries.put("Germany","Berlin");
        countries.put("France","Paris");
        countries.put("Spain","Madrid");


//        Set<Entry<String,String>> entry=countries.entrySet();
        var entrySet=countries.entrySet();

        for (var entry:entrySet) {
            System.out.println( entry.getKey()+" = "+entry.getValue());

        }
        var iterator=countries.entrySet().iterator();
        while (iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" = "+ entry.getValue());
        }

        var values=countries.values();
        for (var value:values) {
            System.out.println(value);
        }

        var iterator2=countries.values().iterator();
        while (iterator2.hasNext()){
            var value=iterator2.next();
            System.out.println(value);
        }





    }
}
