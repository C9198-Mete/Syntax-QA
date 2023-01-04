package homework;

public class Calculation {
    public static void main(String[] args) {
        float number1 = 10.5F;
        float number2 = 20.5F;

        System.out.println("The Addition of 2 numbers "+ number1 +" and " + number2 +" is equal to " + (number1+number2));
        System.out.println("The Subtraction of 2 numbers "+ number1 +" and " + number2 +" is equal to " + (number1-number2));
        System.out.println("The Multiplication of 2 numbers "+ number1 +" and " + number2 +" is equal to " + (number1*number2));
        System.out.println("The Division of 2 numbers "+ number1 +" and " + number2 +" is equal to " + (number1/number2));

        float number3 = 3.9F;
        System.out.println("The square of the " + number3 + " is " + (number3*number3) );
    }
}
