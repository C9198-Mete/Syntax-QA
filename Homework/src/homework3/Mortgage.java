package homework3;

public class Mortgage {
    public static void main(String[] args) {
        double mortgageRate=4.4;
        int mortgageprice=350000;

        if (mortgageRate<4.5){
            System.out.println("You can buy a home");
            if (mortgageprice>200000){
                System.out.println("I will take loan");
            }else {
                System.out.println("I will pay cash");
            }

        }else{
            System.out.println("Let's save some money because interest rate is too high");
        }
    }
}
