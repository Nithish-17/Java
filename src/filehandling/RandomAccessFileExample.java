package filehandling;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;

public class RandomAccessFileExample {
    public static void main(String[] args) {

        try {

            File file = Path.of("src", "filehandling", "RandomAccessFileInput.txt").toFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");

            System.out.println(randomAccessFile.readLine());
            long secondLine = randomAccessFile.getFilePointer();

            System.out.println(randomAccessFile.readLine());
            System.out.println(randomAccessFile.readLine());

            //rewriting second line
            randomAccessFile.seek(secondLine);
            randomAccessFile.writeBytes("rewrite second line");

            randomAccessFile.seek(secondLine);
            System.out.println(randomAccessFile.readLine());

            randomAccessFile.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
