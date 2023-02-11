package class22;

public class Student {

    public void study(){
        System.out.println("Studying......");
    }
    public void doHomework(){
        System.out.println("Solving Homeworks");
    }
    void practice(){
        System.out.println("Practicing the skills");
    }
}

class SyntaxStudent extends Student{
    @Override
    public void study() {
        System.out.println("Syntax Student must study Programming");
    }

    @Override
    public void doHomework() {
        System.out.println("Syntax Student must solve the homeworks");
    }

    @Override
    void practice() {
        System.out.println("Syntax Student must practice Repls");
    }
}
class CollegeStudent extends Student{
    @Override
    void practice() {
        System.out.println("College student must practice to get goog grades");
    }
}
class SchoolStudent extends Student{


}
