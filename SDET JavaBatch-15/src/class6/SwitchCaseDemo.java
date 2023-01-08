package class6;

public class SwitchCaseDemo {
    public static void main(String[] args){

        String country="USA";

        switch (country.toLowerCase()){
            case "usa" :
                System.out.println("Burger");
                break;
            case "italy" :
                System.out.println("Pasta");
                break;
            case "turkey" :
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}
