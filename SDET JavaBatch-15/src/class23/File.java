package class23;

public abstract class File {

    abstract void open();
     void edit(){


     }
     void close(){

     }
}

class JavaFile extends File{
    @Override
    void open() {
        System.out.println("We need nodepad++");
    }
}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("We need Microsoft word");

    }
}

class PdfFile extends File{
    @Override
    void open() {
        System.out.println("We need Adobe");

    }
}
