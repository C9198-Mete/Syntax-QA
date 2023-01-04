package com.syntax.review2;

public class IfElse {
    public static void main(String[] args) {

        boolean isItNight=false;
        if (isItNight){
            System.out.println("I will go to sleep");
        }else {
            System.out.println("It is early to sleep");
        }

        int age = 25;
        String result= (age>20) ? "You are old" : "You are young";
        System.out.println(result);
    }
}
