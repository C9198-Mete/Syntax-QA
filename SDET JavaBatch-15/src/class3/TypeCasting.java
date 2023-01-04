package class3;

public class TypeCasting {
    public static void main(String[] args) {
        long number =125;
        byte shorterNumber = (byte) number;
        float f = 10.5F;
        int num = (int) f;
        System.out.println(shorterNumber);
        System.out.println(num);

        byte b = 10;
        int number2 = b;
        short c = (short) number2;


        System.out.println(b);
        System.out.println(number2);
        System.out.println(c);
    }
}
