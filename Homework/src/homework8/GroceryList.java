package homework8;

import java.util.Arrays;

public class GroceryList {
    public static void main(String[] args) {
        String[][] groc = {{"Onion", "Tomatoes", "Lettuce"}, {"Watermelon", "Banana", "Apple"}, {"Cheese", "Egg", "Olive"}, {"Cake", "Nutella", "Crunch"}};
        for (int i = 0; i < groc.length; i++) {
            for (int j = 0; j < groc[i].length; j++) {
                System.out.print(groc[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("***********");

        for (String[] strings : groc) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();

        }

        System.out.println("***********");

        System.out.println(Arrays.toString(groc[0]));
        System.out.println(Arrays.toString(groc[1]));
        System.out.println(Arrays.toString(groc[2]));
        System.out.println(Arrays.toString(groc[3]));
    }
}
