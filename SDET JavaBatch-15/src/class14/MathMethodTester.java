package class14;

public class MathMethodTester {
    public static void main(String[] args) {
        MathMethod math=new MathMethod();
        math.add(10,30);
        math.mul(5,3,2);

        int result=math.sub(100,50);
        System.out.println(result);
    }
}
