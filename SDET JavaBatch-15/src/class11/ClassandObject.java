package class11;

public class ClassandObject {
    String name,breed,color;

    void bark(){
        System.out.println(name+" can bark");
    }
    void run(){
        System.out.println(name+" can run");
    }
    void play(){
        System.out.println(name+" can play");
    }

    public static void main(String[] args) {

        ClassandObject Husky=new ClassandObject();
        Husky.name="Husky";
        Husky.bark();
        Husky.run();
        Husky.play();
        ClassandObject Bulldog=new ClassandObject();
        Bulldog.name="Bulldog";
        Bulldog.bark();
        Bulldog.run();
        Bulldog.play();
        ClassandObject Labrador=new ClassandObject();
        Labrador.name="Labrador";
        Labrador.bark();
        Labrador.run();
        Labrador.play();
    }


}
