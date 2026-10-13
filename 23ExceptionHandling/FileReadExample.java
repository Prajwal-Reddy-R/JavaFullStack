
// package 23ExceptionHandling;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            FileReader obj = new FileReader("pj1.txt");
            // int ch;
            // while ((ch = obj.read()) != -1) {
            //     System.out.print((char) ch);
            // }
            // obj.close();
        } catch (Exception e) {
            System.out.println("file not found");
        }
    }
}
