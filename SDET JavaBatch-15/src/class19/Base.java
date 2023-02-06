package class19;

public class Base {

    String name="John";

    void hello(){
        System.out.println("Hello method from base class");
    }
}

class Child extends Base{
    String name="Jack";

    void callMe(){
        System.out.println(name);
        System.out.println(super.name);
    }

    void hello(){
        System.out.println("from child class");
    }
    void callingParent(){
        hello();
        super.hello();

    }
}