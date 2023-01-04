package homework3;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter numbers of worked years");
        int workedYear=input.nextInt();
        System.out.println("Enter annual salary");
        int salary=input.nextInt();

        if (workedYear>=5){
            if (salary>50000){
                System.out.println("Your bonus is 5000");
            }else {
                System.out.println("Your bonus is 3000");
            }
        }else {
            System.out.println("You are not eligible for bonus");
        }
    }
}
