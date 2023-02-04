package class18;

public class ConstructorChain {

    ConstructorChain(){
        System.out.println("I'm non argument constructor");
    }

    ConstructorChain(String str){
        this();
        System.out.println(str);
    }

    ConstructorChain(String str,int number){
        this(str);
        System.out.println("This constructor with int parameter "+number);
    }

    public static void main(String[] args) {
        ConstructorChain obj=new ConstructorChain("hello",10);
    }

}
