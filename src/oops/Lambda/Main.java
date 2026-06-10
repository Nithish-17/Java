package oops.Lambda;

public class Main {
    public static void main(String[] args) {

        Printable p = ((x) ->  x + "world");
        String str = p.print("hello");
    }
}
