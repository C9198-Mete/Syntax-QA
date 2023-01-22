package homework8;

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
            for (int j = 0; j < strings.length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();

        }
    }
}
