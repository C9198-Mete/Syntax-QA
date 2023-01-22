package homework8;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        String[][] cars = {{"American", "German", "Korean", "Italian"}, {"Chevy", "Opel", "Mitsubishi", "Mini Couper"}};

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");

            }
        }
        System.out.println();


            for (String[] car : cars) {
                for (int j = 0; j < car.length; j++) {
                    System.out.print(car[j] + " ");

                }

            }


        }
    }

