package class15;

public class MethodPractice2 {


    String reverse(String word) {
        String newStr = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newStr += word.charAt(i);
        }

        return newStr;
    }

    String reverse1(String word) {
        return new StringBuilder(word).reverse().toString();
    }

}

