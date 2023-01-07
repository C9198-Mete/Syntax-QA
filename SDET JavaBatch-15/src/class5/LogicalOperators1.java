package class5;

public class LogicalOperators1 {
    public static void main (String[] args){

        System.out.println(true|false); // true
        System.out.println(false||false); // false


        boolean wifi=false;
        boolean fiveG=false;

        if (wifi||fiveG){
            System.out.println("you are good dor browsing the internet");
        }else {
            System.out.println("Either connect to wifi or to 5G");
        }



    }
}
