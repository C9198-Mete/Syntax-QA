package class19;

public class Parent {

    String name;
    static String lastName;

    Parent(){
        System.out.println("I am a parent class constructor");
    }
    public void hello(){
        System.out.println("Public method Hello from parent class");
    }

    protected static void bye(){
        System.out.println("Protected method bye from parent class");
    }

    private void money(){
        System.out.println("Private method bye from parent class");
    }

    public static void main(String[] args) {
        Parent p=new Parent();

    }
}
