package homework10;

public class Task4 {
    public static void main(String[] args) {
        /*StringBuilder st=new StringBuilder("This is sentence i want to reverse");
        System.out.println(st.reverse());
        String str= st.toString();
        str.split(" ");*/

        String str = "This is sentence i want to reverse";
        String[] arr = str.split(" ");
        /*for (String word:arr) {
            for (int i =word.length()-1; i >=0 ; i--) {
                System.out.print(word.charAt(i));

            }
            System.out.print(" ");
        }*/

        for (String word : arr) {
            System.out.print(new StringBuilder(word).reverse()+" ");
        }



    }
}
