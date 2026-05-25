package filehandling;

import java.io.OutputStreamWriter;

public class OutputStreamReader {
    static void main() {
        try(OutputStreamWriter out = new OutputStreamWriter(System.out)){
        out.write("Hello World");
        out.write('\n');
        out.write(10); //new line
        out.write(97);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
