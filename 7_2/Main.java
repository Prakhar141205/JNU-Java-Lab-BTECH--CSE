import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("first.txt");
        FileOutputStream fos = new FileOutputStream("second.txt");

        int data;

        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();

        System.out.println("File copied successfully!");
    }
}