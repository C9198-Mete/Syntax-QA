package homework4;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your quiz score");
        double quiz=input.nextDouble();
        System.out.println("Please enter your mid term score");
        double midTerm=input.nextDouble();
        System.out.println("Please enter your final score");
        double finalScore=input.nextDouble();

        double avrg=(quiz+midTerm+finalScore)/3;

        if (avrg>=90){
            System.out.println("grade=A");
        } else if (avrg>=70 && avrg<90) {
            System.out.println("grade=B");
        } else if (avrg>=50 && avrg<70) {
            System.out.println("grade=C");
        }else {
            System.out.println("grade=F");
        }

    }
}
