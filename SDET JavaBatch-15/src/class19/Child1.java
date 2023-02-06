package class19;

public class Child1 extends Parent{
    public static void main(String[] args) {

        Child1 c1=new Child1();
        c1.hello();
        Parent.bye();
        Child1.bye();
        c1.bye();
        bye();

        //c1.money(); not accessible coz private

        c1.name="matt";
        Child1.lastName="ash";



    }

}
