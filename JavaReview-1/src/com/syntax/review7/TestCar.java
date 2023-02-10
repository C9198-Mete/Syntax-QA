package com.syntax.review7;

public class TestCar {
    public static void main(String[] args) {

        Tesla tesla=new Tesla("Tesla","S",2022,340,"electric",true);

        // from super class
        tesla.start();
        tesla.drive(120);

        // from subclass
        tesla.haveAutopilot();
        tesla.drive("Miami");

    }
}
