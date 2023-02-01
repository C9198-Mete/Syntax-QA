package class17;

public class Student {

    String name;
    int age;
    String id;
    double weight;

    Student(String stname,int stage,String stid, double stweight){
        name=stname;
        age=stage;
        id=stid;
        weight=stweight;
    }

    void printInfo(){
        System.out.println("Name:"+name+" age:"+age+" id:"+id+" Weight:"+weight);
    }

    public static void main(String[] args) {
        Student st1=new Student("Matt",23,"AB123",85);
        st1.printInfo();
        Student st2=new Student("Ash",35,"Cb534",75);
        st2.printInfo();
        Student st3=new Student("Asghar",33,"TYT45",80);
        st3.printInfo();
        Student st4=new Student("Ahmet",27,"KL67",77);
        st4.printInfo();
        Student st5=new Student("Musa",43,"QW98",72);
        st5.printInfo();
    }
}
