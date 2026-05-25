package oops.Lambda;

import java.util.Comparator;

public class Printer implements  Printable  {
    @Override
    public String print(String s) {
        return s + "world";
    }
    static void main() {
        Printer p = new Printer();
        String s = p.print("hello");
        


    }
}
