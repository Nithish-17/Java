package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedWriterClass {
    static void main() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:/java/Strivers_DSA/src/filehandling/file.txt",true))){
            bufferedWriter.write("\nhello this is written from buffered writer");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
