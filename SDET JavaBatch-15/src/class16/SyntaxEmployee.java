package class16;

public class SyntaxEmployee {

    String empID;
    double salary;
    static String ceo="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee employee1=new SyntaxEmployee();
        employee1.empID="S123";
        employee1.salary=60000;

        SyntaxEmployee employee2=new SyntaxEmployee();
        employee2.empID="AB983";
        employee2.salary=70000;


        System.out.println(employee1.empID);
        System.out.println(employee1.salary);
        System.out.println(employee1.ceo);

        System.out.println(employee2.empID);
        System.out.println(employee2.salary);
        System.out.println(employee2.ceo);
    }
}
