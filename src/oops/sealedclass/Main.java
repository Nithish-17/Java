package oops.sealedclass;

//restricting the inheritance of class to limited classes ---- by seal


sealed class  A permits B,C{}

final class B extends A {}

sealed class C extends A permits D{}

non-sealed class D extends C {}

class E extends D{}


/* the extending class should be
        1.sealed
        2.non-sealed
        3.final
*/


public class Main {
    public static void main(String[] args) {

    }
}
