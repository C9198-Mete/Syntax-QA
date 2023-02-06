package class19;

public class JavaTeacher extends Teacher {

    void code(){
        System.out.println("Java teacher teaches how to code");
    }

    public static void main(String[] args) {
        JavaTeacher java=new JavaTeacher();
        java.teacherName="Matt";
        java.teacherId="A123";
        java.homework();
        java.grade();
        java.scholarship();
        //java.extrapoint(); private members


    }


}
