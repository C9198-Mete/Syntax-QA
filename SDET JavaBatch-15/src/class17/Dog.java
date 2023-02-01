package class17;

public class Dog {

    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogName,String dogBreed,String dogColor,int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;

    }

    void printInfo(){
        System.out.println("Name:"+name+" Breed:"+breed+" color:"+color+" age:"+age+" Weight:"+weight);
    }


    public static void main(String[] args) {
        Dog dog1=new Dog("Alex","Golden","Black",3,60);
        dog1.printInfo();


        Dog dog2=new Dog("Cay","Bulldog","Black",4,40);
        dog2.printInfo();


        Dog dog3=new Dog("Mike","Golden","Black",2,35.5);
        dog3.printInfo();




    }
}
