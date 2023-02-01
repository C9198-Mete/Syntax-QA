package class16;

public class Student {

    public static void main(String[] args) {

        Student student1=new Student();
        student1.name="Matt";
        student1.id="123";
        student1.age=33;
        student1.weight =80;
        student1.schoolName="Syntax";

        Student student2=new Student();
        student2.name="Carl";
        student2.id="456";
        student2.age=38;
        student2.weight =70;
//        student2.schoolName="Syntax";

        Student student3=new Student();
//        student3.name="Nelson";
        student3.id="789";
        student3.age=24;
        student3.weight =78;
//        student3.schoolName="Syntax";

        System.out.println(student2.schoolName);
        System.out.println(student3.name); // it will give you a null
        System.out.println(Student.schoolName); // another way that access static variable

        printStudentinfo();

    }

    String name;
    String id;
    static String schoolName;
    int age;
    double weight;

    static void printStudentinfo(){
        System.out.println(schoolName);
        // System.out.println(name); You can't access
    }


}
