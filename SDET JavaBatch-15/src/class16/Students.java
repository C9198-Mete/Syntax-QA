package class16;

public class Students {

    String name;
    String ID;
    static int noOfStudents;


    public static void main(String[] args) {
        Students student1=new Students();
        student1.name="Matt";
        student1.ID="AB123";
        Students.noOfStudents++;

        Students student2=new Students();
        student2.name="Carl";
        student2.ID="DS433";
        noOfStudents++;

        Students student3=new Students();
        student3.name="Micheal";
        student3.ID="Qw325";
        noOfStudents++;

        System.out.println(Students.noOfStudents);

    }
}
