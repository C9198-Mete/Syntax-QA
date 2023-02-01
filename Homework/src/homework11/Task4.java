package homework11;

public class Task4 {
    public static void main(String[] args) {

        Task4 task4=new Task4();
        System.out.println(task4.greeting("Turkish"));

    }

    String greeting(String language) {

        switch (language.toLowerCase()) {
            case "english":
                return "Hello";
            case "turkish":
                return "Merhaba";
            case "spanish":
                return "Hola";
            default:
                return "Country is not supported";

        }

    }
}
