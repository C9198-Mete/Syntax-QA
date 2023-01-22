package class12;

public class StringDemo {
    public static void main(String[] args) {
        String strObj=new String("Java");
        String strObj2="Java";

        System.out.println(strObj.length());
        String str="Banana ";
        int len=str.length();
        System.out.println(len);
        String name="Matt michealson ";
        if(name.length()>10){
            System.out.println("Name can't be more than 10 letters");
        }


    }
}
