package class30;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Files/test2.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);

        Properties properties=new Properties();
        properties.setProperty("User","Matt");
        properties.setProperty("Password","Matt123");
        properties.setProperty("Browser","Chrome");
        properties.store(fileOutputStream,"Matt has been added");
    }
}
