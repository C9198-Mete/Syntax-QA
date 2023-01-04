package homework3;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your city name");
        String city=input.nextLine().toUpperCase();

        System.out.println("Please enter your local temperature in fahrenheit");
        int temp=input.nextInt();
        double cel = (temp-32)*.5556;

        System.out.println("The temperature is the " + city + " is " + cel);

    }
}
