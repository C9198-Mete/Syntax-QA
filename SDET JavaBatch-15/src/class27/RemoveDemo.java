package class27;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");
        words.add("SDLC");

        var name="kaskd";
        var c='s';

        /*Iterator<String> iterator= words.iterator();

        while (iterator.hasNext()){
            String s= iterator.next();
            if (s.endsWith("a")){
                iterator.remove();
            }
        }*/

        words.removeIf(a -> a.startsWith("C"));
        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);
    }
}
