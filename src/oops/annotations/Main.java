package oops.annotations;

class A{
    void show(){
        System.out.println("A");
    }
}
class B extends A{
    @Override
    void show() {
        System.out.println("overridden");
    }

    @Deprecated
    void func() {
        System.out.println("B");
    }
}

public class Main {
    static void main() {
        B b = new B();
        b.func();
    }
}
