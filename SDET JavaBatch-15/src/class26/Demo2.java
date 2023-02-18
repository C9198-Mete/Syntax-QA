package class26;

public class Demo2 {
    public static void main(String[] args) {

        String name="Savo";
        String name2="Nima";

        String[] names={"Hiral","Nima","Laura","Nat"};

        System.out.println(contain(names,name2));

    }

   public static Boolean contain(String[] names,String name) {
       for (String n : names) {
           if (n.equals(name)) {
               return true;
           }
           }
       return false;
   }
}
