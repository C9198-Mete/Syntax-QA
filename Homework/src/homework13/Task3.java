package homework13;

public class Task3 {

    private Task3(){
        System.out.println("constructor without any parameter");
    }
    Task3(String name){
        System.out.println("constructor with String parameter");
    }
    public Task3(int number){
        System.out.println("constructor with int parameter");
    }

    protected Task3(char c){
        System.out.println("constructor with char parameter");
    }

    public static void main(String[] args) {
        Task3 task31=new Task3();
        Task3 task32=new Task3("Java");
        Task3 task33=new Task3(34);
        Task3 task34=new Task3('A');
    }

}
