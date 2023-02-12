package class23;

public class FileTester {
    public static void main(String[] args) {

        File [] files={new JavaFile(25),new WordFile(45),new PdfFile(55)};
        for (File f:files) {
            f.open();
            f.edit();
            f.close();

        }

    }
}
