package com.syntax.review7;

public class Methods {

    void hello(){
        System.out.println("Hello");
    }

    void sayHello(String name){
        System.out.println("Hello "+name);
    }

    int larger(int num1,int num2){
        return Math.max(num1,num2);
    }

    double avr(double num1,double num2){
        return ((num1+num2)/2);
    }

    String rev(String name){
        StringBuilder n=new StringBuilder(name);
        return n.reverse().toString();
    }

    int min(int arr[]){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }

        }return min;
    }

    public static void main(String[] args) {

        String name="Matt";
        int characters=name.length();
        System.out.println(characters);

        Methods obj=new Methods();
        obj.sayHello(name);
        System.out.println(obj.larger(4,6));
        double av=obj.avr(8,9);
        System.out.println(av);
        System.out.println(obj.rev("Hello"));

        String str=" Batch15 ";
        boolean empty=str.toUpperCase().isEmpty();
        char charecter=str.trim().charAt(2);
        System.out.println(charecter);

        System.out.println(obj.min(new int[]{3, 4, 5, 6, 7}));
    }

}
