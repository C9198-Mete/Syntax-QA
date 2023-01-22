package class12;

public class StringDemo11 {
    public static void main(String[] args) {

        String str="Java is not pain";
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("word"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("not"));

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+" has the index "+ i);

        }



        }
    }
