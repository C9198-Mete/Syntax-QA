package homework13;

public class Students {

    String name;
     int mathGrade;
     int reading;
     int writing;

    Students(String stname, int m, int r,int w){
        name=stname;
        mathGrade=m;
        reading=r;
        writing=w;
    }

    void printavrg() {
        System.out.println("Average is :"+((mathGrade+reading+writing)/3) );
    }
}
