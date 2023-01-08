package class6;

public class LogicalNotDemo {
    public static void main(String[] args){

        String password="asd";
        if (!password.equals("Pass1234")){
            System.out.println("Wrong password");
        }

        boolean isRaining=true;

        if (!isRaining){
            System.out.println("lets go for a walk");
        }else {
            System.out.println("lets take the umbrella");
        }


    }
}
