package class24;

public interface Movable {
    void move();
}
 interface OwnAble{

    void own();

}

class Car implements Movable,OwnAble {
    @Override
    public void move() {
        System.out.println("Car can move");
    }


    @Override
    public void own() {
        System.out.println("You can own a Car");
    }
}

class Dog implements Movable,OwnAble {

    @Override
    public void move() {
        System.out.println("Dog can move");

    }


    @Override
    public void own() {
        System.out.println("You can own a Dog");
    }
}