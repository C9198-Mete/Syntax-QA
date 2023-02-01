package homework12;

public class Task3 {

    private static String vowel(String input){
        return input.replaceAll("[^aeiouAEIOU]","");

    }


    public static void main(String[] args) {
        System.out.println(vowel("JAva"));
    }
}
