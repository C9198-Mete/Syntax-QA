package homework12;

public class Task2 {

    public static String reverseStr(String input){
        return new StringBuilder(input).reverse().toString();
    }


    public static void main(String[] args) {
        reverseStr("Matt");
    }
}
