package class18;

public class Test {
    String name;
    int age;
    void m1(){
        System.out.println("m1 method name is "+name+" age is "+age );
    }
    Test(){
        System.out.println("0 arg constructor"+"name is "+name+" age is "+age);
    }
    Test(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println("1 arg constructor "+"name is "+name+" age is "+age);
    }
    public static void main(String[] args) {
        Test t1=new Test();
        t1.m1();
        Test t2=new Test(10,"Matt");
        t2.m1();

    }
}
