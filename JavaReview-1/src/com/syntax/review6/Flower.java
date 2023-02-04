package com.syntax.review6;

public class Flower {


    static boolean pretty=true;
    String color,  name;
    int price;

    void grow(){
        System.out.println(name+" is growing");
    }

    public static void main(String[] args) {

        Flower flower1=new Flower();


        flower1.name="Hibicius";
        flower1.color="red";
        flower1.price=5;
        System.out.println(Flower.pretty);
        flower1.grow();

        Flower flower2=new Flower();

        flower2.name="Rose";
        flower2.color="blue";
        flower2.price=15;

        flower2.grow();
    }
}
