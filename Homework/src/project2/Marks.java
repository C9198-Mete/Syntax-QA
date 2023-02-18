package project2;

import java.util.Scanner;

public abstract class  Marks {

    int math,science,physics;

    public Marks(int math, int science, int physics) {
        this.math = math;
        this.science = science;
        this.physics = physics;
    }
    abstract void getPercentage();
}
class StudentA extends Marks{


    public StudentA(int math, int science, int physics) {
        super(math, science, physics);
    }

    @Override
    void getPercentage() {
        System.out.println("StudentA average is "+(math+science+physics)/3);

    }


}

class StudentB extends Marks{

    int chemistry;

    public StudentB(int math, int science, int physics, int chemistry) {
        super(math, science, physics);
        this.chemistry=chemistry;
    }

    @Override
    void getPercentage() {
        System.out.println("StudentB average is "+(math+science+physics+chemistry)/4);

    }

    public static void main(String[] args) {

        Marks studentA=new StudentA(90,80,70);
        studentA.getPercentage();
        Marks studentB=new StudentB(88,78,98,67);
        studentB.getPercentage();


    }



}