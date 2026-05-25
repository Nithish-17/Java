package filehandling;

import java.io.*;

public class FileExample {
    static void main()  {
        File file = new File("newfile.txt");
        try{
            file.createNewFile();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());


        try {
            FileWriter writer = new FileWriter(file,true);
            writer.write("this is line one");
            writer.write("this is line two");
            writer.write("this is line three");
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("this is buffered line");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileReader fr = new FileReader(file);
            int ch;
            while((ch = fr.read()) != -1)
                System.out.println((char) ch);
            fr.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null)
                System.out.println(line);
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //copy to a new file
        try {
            FileReader fr = new FileReader(file);
            File file2 = new File("copyfile.txt");
            file2.createNewFile();
            FileWriter fw = new FileWriter(file2);
            int data;
            while((data = fr.read()) != -1)
                fw.write((char)data);
            fr.close();
            fw.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //file.delete();
        /*----------renaming file ------------
        File newFile = new File("newname.txt");
        file.renameTo(newFile);*/

    }
}
