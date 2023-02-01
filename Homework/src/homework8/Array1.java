package homework8;

public class Array1 {
    public static void main(String[] args) {
        String[][] name={{"John","Ash","Mike","Liz"},{"A","C","B","A"}};
        for (int i = 0; i < name[0].length; i++) {
            if (name[1][i].equals("A")||name[1][i].equals("B")){
                System.out.println(name[0][i]);
            }


            }

        }

    }

