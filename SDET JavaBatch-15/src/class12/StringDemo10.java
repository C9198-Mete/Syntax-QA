package class12;

public class StringDemo10 {
    public static void main(String[] args) {

        String str="I love javadjadkjh 23442 $^&&%$$";
        int count=0;
        int count1=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                count1++;
            }
        }
        System.out.println(count1);

        }
    }
