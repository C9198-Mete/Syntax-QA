package homework7;

public class Task2 {
    public static void main(String[] args) {
        String[] names={"Matt","Mustafa","Ash","George"};
        System.out.println(names[0]);
        String[] lastnames= new String[4];
        lastnames[0]="Zep";
        lastnames[1]="Stock";
        lastnames[2]="Beert";
        lastnames[3]="Took";
        for (String i:lastnames) {
            System.out.println(i);
        }
    }
}
