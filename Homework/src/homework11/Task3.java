package homework11;

public class Task3 {
    public static void main(String[] args) {
        Task3 check=new Task3();
        System.out.println(check.pal("ey edip adanada pide ye"));

        Task3 task3=new Task3();
        task3.isPalindrome("adanada");

    }


    String pal(String word){
        if ( word.equals(new StringBuilder(word).reverse().toString())){
            return word+" is Palindrome";
        }else {
            return word+" is not Palindrome";
        }
    }

    void isPalindrome(String str){
        if (str.equals(new StringBuilder(str).reverse().toString())){
            System.out.println(str+" is a Palindrome");
        }else {
            System.out.println(str+" is not a Palindrome");
        }
    }
}
