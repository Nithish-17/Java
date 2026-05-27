package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileClass {
    static void main() {
        try{
            File file = new File("D:/java/Strivers_DSA/src/filehandling/test.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.write("Hello World");
            fileWriter.close();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
            fileReader.close();



        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
