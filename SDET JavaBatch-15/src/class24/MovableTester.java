package class24;

public class MovableTester {
    public static void main(String[] args) {

        OwnAble [] ar={new Car(),new Dog()};
        for (OwnAble obj:ar) {
            obj.own();
        }
        Movable [] arr={new Car(),new Dog()};
        for (Movable m:arr) {
           m.move();


        }
    }
}
