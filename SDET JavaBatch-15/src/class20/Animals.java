package class20;

public class Animals {

    String name;
    String color="Black";
}
class Cat extends Animals{
    //String color="white";
    int age=10;
    double weight;

    void printcolor(){
        //String color="Blue";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.printcolor();

    }
}