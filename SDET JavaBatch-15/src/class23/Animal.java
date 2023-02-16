package class23;

public abstract class Animal {


    abstract void speak();

    void eat(){
        System.out.println("Animals Eat 2 times a day");
    }

}

class Dog extends Animal{

    @Override
    void speak() {
        System.out.println("Woof woof");
    }

}

class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meowww meowww");
    }
}

abstract class Horse extends Animal{

}
