package homework9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Mom's first name?");
        String momName=input.next();
        System.out.println("Dad's first name?");
        String dadName=input.next();
        System.out.println("Boy or girl?");
        String child=input.next();
        String firstHalf="";
        String secHalf="";

        if (child.equalsIgnoreCase("boy")){
            firstHalf=dadName.substring(0,dadName.length()/2);
            secHalf=momName.substring(momName.length()/2);

        } else if (child.equalsIgnoreCase("girl")) {
            firstHalf=momName.substring(0,momName.length()/2);
            secHalf=dadName.substring(dadName.length()/2);

        }
        System.out.println(firstHalf+secHalf);

    }
}
