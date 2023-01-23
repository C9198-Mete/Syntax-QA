package project1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] countries = new String[5];
        System.out.println("Please enter the names of 5 countries:");
        for (int i = 0; i < countries.length; i++) {
            countries[i] = input.nextLine();
        }
        for (int i = 0; i < countries.length; i++) {
            System.out.print(countries[i]+" ");
        }
        System.out.println();

        for (String s : countries) {
            System.out.print(s + " ");
        }
        System.out.println();



        for (String country : countries){
            switch (country.toLowerCase()){
                case "usa" :
                    System.out.println("Washington is a capital of USA");
                    break;
                case "italy" :
                    System.out.println("Rome is a capital of Italy");
                    break;
                case "turkey" :
                    System.out.println("Ankara is a capital of Turkey");
                    break;
                case "england" :
                    System.out.println("London is a capital of England");
                    break;
                case "france" :
                    System.out.println("Paris is a capital of France");
                    break;
                default:
                    System.out.println("Wrong country");


            }

        }
    }
}
