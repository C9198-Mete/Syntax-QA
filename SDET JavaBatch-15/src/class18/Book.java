package class18;

public class Book {
    String name,address;
    int year;

    Book(String name, String address){
        this.name=name;
        this.address=address;
    }
    Book(String name,String address,int year){
        this(name,address);
        this.year=year;
    }
    void displayInfo(){
        System.out.println("Student name is "+name+" address is "+address+" year is "+year);
    }

    public static void main(String[] args) {
        Book st1=new Book("matt","210 street",23);
        st1.displayInfo();


    }
}
