package oops.innerclass;
class A{
    int a;
    int b;

    public A(int a,int b) {
        this.a = a;
        this.b = b;
    }

    static void show(A obj) {
        System.out.println(obj.a+obj.b);
    }

    static void print(){
        System.out.println("hello");
    }
    void hello(A obj){
        print();
    }
}


public class Main {
    static void main() {
                A a = new A(1,2);
                //A.show(a);
                a.hello(a);
    }
}
