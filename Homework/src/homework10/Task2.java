package homework10;

public class Task2 {
    public static void main(String[] args) {
        String str="jfdlksadljljaA9437598758435)(*&%$#@";
        System.out.println(str.replaceAll("[^A-za-z0-9]","").length());
        System.out.println(str.replaceAll("[^A-za-z0-9]",""));

    }
}
