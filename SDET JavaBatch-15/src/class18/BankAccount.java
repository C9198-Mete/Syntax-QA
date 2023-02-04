package class18;

public class BankAccount {
    long accountNumber;
    double money;

    void deposit(){
        System.out.println("Deposit method from Bank account class");
    }

}

class Checking extends BankAccount{

    double interest;
    void transfer(){
        System.out.println("transfer from Checking class");
    }
}

class Savings extends BankAccount{

    double profit;

    void takeProfit(){
        System.out.println("Profit method from sving class");
    }
}

class SuperSavings extends Savings{
    void superSaving(){
        System.out.println("Super saving method from supersaving class");
    }
}
