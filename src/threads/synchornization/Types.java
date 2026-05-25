package threads.synchornization;

public class Types {
    private static int count = 0;

   /* ----------------locking the whole methods should be like this------------------
    synchronized void increment() {   // whole method locked
        calculate();      // doesn't need lock
        value++;          // needs lock
        print();          // doesn't need lock
    }
    so perfomance, parallelism is failed*/




   /* static synchronized void increment() {-----------not recommended
        count++;
    }

    static void increment() {
        synchronized (Types.class) {
            count++;
        } // blocking only the critical section
    }

    static void increment(){
        synchronized (this) {----locks the current object for different synchronized methods also
            count++;
        }
    }

    private Object lock = new Object();
    private Object lock2 = new Object();
    static void increment(){
        synchronized (lock){
            count++;
        }
    }

    static void decrement(){
        synchronized (lock2){
            count--;
        }
    }*/

   /* we can also lock the particular class or object
    if i use this or synchronized keyword to funciton it will lock the entire object and if another thread tries to access different fucnion it will not possible
    so we can crate any object and use that object for that particular method
    */


}
