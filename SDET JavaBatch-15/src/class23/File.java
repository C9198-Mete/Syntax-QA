package class23;

public abstract class File {

    int size;

    File(int size){
        this.size=size;
    }

    abstract void open();
     void edit(){
         System.out.println("editing the file");
     }
     void close(){
         System.out.println("Closing the file");
     }
}

class JavaFile extends File{
    JavaFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("We need to open nodepad++");
    }
}
class WordFile extends File{
    WordFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("We need to open Microsoft word");

    }
}

class PdfFile extends File{
    PdfFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("We need to open Adobe");

    }
}
