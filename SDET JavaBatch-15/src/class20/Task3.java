package class20;

public class Task3 {

    private void method(String str1){
        System.out.println("Method with one string");
    }

    private void method(String str1,String str2){
        System.out.println("Method with two string");
    }

    private void method(String str1,String str2,String str3){
        System.out.println("Method with three string");
    }

    public static void main(String[] args) {

        Task3 task=new Task3();
        task.method("Java");
        task.method("Java","Python");
        task.method("Java","Python","Golang");
    }
}
