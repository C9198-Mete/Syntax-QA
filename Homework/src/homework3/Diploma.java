package homework3;

public class Diploma {
    public static void main(String[] args) {
        boolean diploma = true;
        double gpa = 3.46;

        if (diploma) {
            System.out.println("Congratulations");
            if (gpa >= 3.5) {
                System.out.println("You are eligible for scholarship");
            }else {
                System.out.println("You should studied hard");
            }
        }else {
            System.out.println("You should get a degree");
        }
    }
}
