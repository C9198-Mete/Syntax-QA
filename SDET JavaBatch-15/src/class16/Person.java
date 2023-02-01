package class16;

public class Person {
    private double bankBalance=125000;
    String address="Street 123"; // default access
    public String name="John Snow";

    private void printPhonePaswword(){
        System.out.println("pass123");
    }

    void printSSN(){
        System.out.println("1234434543");
    }

    public void printInstagramAccount(){
        System.out.println("mks");
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printPhonePaswword();
        person.printSSN();
        person.printInstagramAccount();

    }
}
