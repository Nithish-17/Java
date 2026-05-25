package filehandling;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class FileWriterClass {
    static void main() {
        try(FileWriter fileWriter = new FileWriter("D:/java/Strivers_DSA/src/filehandling/file.txt")){
            fileWriter.write("this is overrided");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileWriter fileWriter = new FileWriter("D:/java/Strivers_DSA/src/filehandling/file.txt",true)){
            fileWriter.write("\nthis is appended because of true parameter ");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
