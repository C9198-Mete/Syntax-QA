package class27;

public class BoxingDemo {
    public static void main(String[] args) {

        Integer num=new Integer(10);
        int num1=num; // it is auto unboxing
        int num2=num.intValue(); // unboxing

        double d=12.3;
        Double wrapperD=new Double(d); // boxing
        Double wrapperP=d; // auto boxing




    }
}
