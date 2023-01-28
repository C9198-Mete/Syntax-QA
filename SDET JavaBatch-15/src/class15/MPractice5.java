package class15;

public class MPractice5 {
    public static void main(String[] args) {
        MPractice5 str=new MPractice5();
        System.out.println(str.printSchool());
        System.out.println(str.createEmail("matt","broke","gmail"));

    }

    String printSchool(){
        return "Syntax";
    }

    String createEmail(String name,String lastname,String mail){
        return name+lastname+"@"+mail+".com";
    }
}
