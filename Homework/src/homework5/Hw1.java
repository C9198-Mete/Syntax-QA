package homework5;

public class Hw1 {
    public static void main(String[] args) {

        boolean workDay =true;
        int day=1;
        while (day<6){
            if (workDay){
                System.out.println("I need a day off");
            }
            day++;
        }
        System.out.println("I do not need a day of any more");
    }
}
