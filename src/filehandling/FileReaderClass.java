package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    static void main() {
        try(FileReader fileReader = new FileReader("D:/java/Strivers_DSA/src/filehandling/file.txt")) {
            int ch;
           /* while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }*/
            while(fileReader.ready())
                System.out.println((char)fileReader.read());
        } catch (
                IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
