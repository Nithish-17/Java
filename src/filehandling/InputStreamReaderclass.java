package filehandling;

import java.io.*;

public class InputStreamReaderclass {
    static void main() throws IOException {
         // gets byte stream as input and converts to character stream
        System.out.print("Enter something : ");
        try(InputStreamReader isr = new InputStreamReader(System.in)){ //-------- try with resource
//            char ch = (char)isr.read();
//            System.out.print(ch);
            int ch;
            while((ch = isr.read()) != -1){
                System.out.print((char)ch);
                if(ch=='\n'){
                    break;
                }
            }
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }




    }
}
