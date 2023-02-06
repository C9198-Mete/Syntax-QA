package class19_1;

import class19.Teacher;

public class SeleniumTeacher extends Teacher {
    public static void main(String[] args) {
        SeleniumTeacher selenium=new SeleniumTeacher();
        selenium.grade(); // public
        selenium.homework(); // protected available through the inheritance

    }



}
