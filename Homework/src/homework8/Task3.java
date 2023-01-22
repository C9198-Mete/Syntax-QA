package homework8;

public class Task3 {
    public static void main(String[] args) {
        String[][] countries={{"USA","Canada","Mexico"},{"Argentina","Brazil","Chile"},{"Spain","France","Germany","Italy"},{"China","Japan","Taiwan"},{"Togo","Senegal","Egypt"}};
        int total=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("*********");

        for (String[] cnt:countries) {
            for (int i = 0; i < cnt.length; i++) {
                System.out.print(cnt[i]+" ");
                total++;

            }


        }
        System.out.println();
        System.out.println(total);
    }
}
