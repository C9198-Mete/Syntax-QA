package homework8;

public class DogTest {
    public static void main(String[] args) {

        Dog husky=new Dog();
        husky.name="Fred";
        husky.color="Grey";
        husky.age=6;
        husky.weight=87;
        husky.eat();
        husky.bark();

        System.out.println("*********");

        Dog bulldog=new Dog();
        bulldog.name="fox";
        bulldog.color="Grey";
        bulldog.age=6;
        bulldog.weight=87;
        bulldog.eat();
        bulldog.bark();
        System.out.println("*********");

        Dog labrador=new Dog();
        labrador.name="neo";
        labrador.color="black";
        labrador.age=3;
        labrador.weight=47;
        labrador.eat();
        labrador.bark();
    }
}
