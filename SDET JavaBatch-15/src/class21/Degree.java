package class21;

import javax.annotation.processing.SupportedAnnotationTypes;

public class Degree {

    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}

class Masters extends Degree{

    @Override
    void getPrerequisite(){
        System.out.println("To get a Masters you need Bachelors diploma");
    }

}
class DegreeTester{
    public static void main(String[] args) {
        Masters mstr=new Masters();
        mstr.getPrerequisite();
        Bachelors bch=new Bachelors();
        bch.getPrerequisite();
        Degree dg=new Degree();
        dg.getPrerequisite();
    }

}
