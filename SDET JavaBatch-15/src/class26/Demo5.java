package class26;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {

        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        characters.add('F');
        characters.add('G');



        for (Character letter:characters) {
            System.out.println(letter);
        }

    }
}
