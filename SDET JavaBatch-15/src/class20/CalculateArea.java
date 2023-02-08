package class20;

public class CalculateArea {

    void calculateArea(int a,int b){
        System.out.println(a*b);
    }

    void calculateArea(int a){
        System.out.println(a*a);
    }

    public static void main(String[] args) {
        CalculateArea area=new CalculateArea();
        area.calculateArea(5);
        area.calculateArea(10,20);
    }
}
