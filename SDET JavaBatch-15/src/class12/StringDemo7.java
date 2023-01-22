package class12;

public class StringDemo7 {
    public static void main(String[] args) {

        String str="I love java";
        boolean startswith=str.startsWith("I");
        System.out.println(startswith);
        System.out.println(str.endsWith("java"));

        System.out.println(str.toLowerCase().startsWith("i"));
    }
}
