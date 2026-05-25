package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
    // reads from a character stream it is buffer so wrapping of one character stream to another -- faster
    static void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){ //-- auto close after resuource usage
            System.out.print("Enter something : ");
            int c = br.read();
            System.out.println((char)c);
            while((c = br.read()) != -1){
                System.out.print((char)c);
                if((char)c == '\n') break;
            }
            System.out.println("Reading a full line : " + br.readLine());
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader("D:/java/Strivers_DSA/src/filehandling/file.txt"))) {
            while (br.ready()) {
                System.out.println("Reading a file lines : " + br.readLine());
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
