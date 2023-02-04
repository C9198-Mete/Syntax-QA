package class18;

public class Student {
    String name,address;

    Student(String name,String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println("Student name is "+this.name+" address is "+this.address);
    }

    public static void main(String[] args) {
        Student st1=new Student("matt","210 street");
        st1.displayInfo();
    }
}
