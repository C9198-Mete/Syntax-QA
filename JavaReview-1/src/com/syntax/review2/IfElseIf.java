package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {
        int work=8;
        if (work>25){
            System.out.println("great job");
        } else if (work>20) {
            System.out.println("good job");

        } else if (work>10) {
            System.out.println("ok job");
        } else if (work>5) {
            System.out.println("not good job");
        }


        String browser="chrome";

        if (browser.equals("chrome")){
            System.out.println("Test cases executed on chrome browser");
        } else if (browser.equals("safari")) {
            System.out.println("Test cases executed on safari browser");
        }else if (browser.equals("firefox")) {
            System.out.println("Test cases executed on firefox browser");
        }else {
            System.out.println("You can not execute");
        }
    }
}
