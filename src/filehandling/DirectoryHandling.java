package filehandling;

import java.io.File;

public class DirectoryHandling {
    static void main() {
        File dir = new File("myFolder");
        // directory creation
        dir.mkdir();

        String[] files = dir.list();
        for(String f : files)
            System.out.println(f);

    }
}
