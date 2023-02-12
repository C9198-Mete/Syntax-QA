package class23;

public class AnimalTester {
    public static void main(String[] args) {

        //Animal animal=new Animal();

        Animal [] arr={new Cat(),new Dog()};
        for (Animal animal:arr){
            animal.eat();
            animal.speak();
        }


    }
}
