package class4;

public class NestIf2 {
    public static void main(String[] args) {
        int money=1000;
        String day="Saturday";
        boolean mood=false;

        if (money>700){
            if (mood){
                if (day.equals("Sunday")){
                    System.out.println("lets go shopping");
                }else {
                    System.out.println("we can go tomorrow");
                }
            }else {
                System.out.println("I dont wanna go");
            }
        }else{
            System.out.println("lets save money");
        }

        }

    }

