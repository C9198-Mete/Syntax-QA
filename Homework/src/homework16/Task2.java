package homework16;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        Set<Student> students=new HashSet<>();
        students.add(new Student("Savo",126));
        students.add(new Student("Matt",124));
        students.add(new Student("Mike",125));

        for (Student student:students) {
            System.out.println(student.getName());
            System.out.println(student.getStudentID());
        }



    }
}

class Student{
    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

}
