package class4;

public class NestIf {
    public static void main(String[] args) {
        int money=1000;
        String day="Sunday";
        boolean mood=true;

        if (money>700){
            if (mood){
                if (day.equals("Sunday")){
                    System.out.println("lets go shopping");
                }
            }
        }
        else {
            System.out.println("don't go shopping");
        }

    }
}
