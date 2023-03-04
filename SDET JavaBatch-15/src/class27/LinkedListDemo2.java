package class27;

import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {
        LinkedList<String> subjects=new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Java");
        subjects.add("Jira");
        subjects.add("Git");

        LinkedList<String> futureSubjects=new LinkedList<>();
        futureSubjects.add("Selenium");
        futureSubjects.add("Testing");
        futureSubjects.add("SQL");
        futureSubjects.add("Jenkins");

        LinkedList<String> allSubjects=new LinkedList<>();
        allSubjects.addAll(subjects);
        allSubjects.addAll(futureSubjects);
        System.out.println(allSubjects);

        LinkedList<String> subjectsILike=new LinkedList<>();
        subjectsILike.add("Java");
        subjectsILike.add("SDLC");
        subjectsILike.add("SQL");
        System.out.println(subjectsILike);

        allSubjects.removeAll(subjectsILike);
        System.out.println(allSubjects);
    }
}
