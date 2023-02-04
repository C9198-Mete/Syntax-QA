package class18;

public class BankTest {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accountNumber=4324324324L;
        ba.money=1000;
        ba.deposit();
        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println("----Creating obj Checking account");

        Checking check=new Checking();
        check.accountNumber=1312;
        check.money=780;
        check.interest=0;
        check.deposit();
        check.transfer();

        System.out.println("----Creating obj Savinng account");

        Savings save=new Savings();
        save.accountNumber=2343242344L;
        save.money=450;
        save.profit=100;
        // save.interest=0; You can't access
        save.deposit();
        save.takeProfit();

        SuperSavings superSavings=new SuperSavings();
        superSavings.accountNumber=3213L;
        superSavings.money=2000;
        superSavings.profit=0;
        superSavings.deposit();
        superSavings.takeProfit();
        superSavings.superSaving();


    }
}
