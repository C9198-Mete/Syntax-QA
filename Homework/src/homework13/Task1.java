package homework13;

public class Task1 {

    String name;
    int age;
    String id;
    double weight;

    Task1(String stname,int stage,String stid, double stweight){
        name=stname;
        age=stage;
        id=stid;
        weight=stweight;
    }
    void printInfo(){
        System.out.println("Name:"+name+" age:"+age+" id:"+id+" Weight:"+weight);
    }
}
