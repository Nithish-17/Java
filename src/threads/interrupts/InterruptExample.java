package threads.interrupts;
/*
interrupt()      → sets the interrupt flag to true (sends interrupt request)
isInterrupted()  → checks the interrupt flag without changing it
interrupted()    → checks the interrupt flag and clears it (resets to false)

Note: Interrupt does not stop a thread forcefully; it only signals the thread
to stop, and the thread decides how to handle it.

each thread has a interrupt flag(true,false)
*/

public class InterruptExample {
    Thread one = new Thread(()->{
            try {
                System.out.println("hello");
                Thread.sleep(1000);
                System.out.println("my name is nithiesh");
            } catch (InterruptedException e) {
                System.out.println("interrupted \n\n");
            }
    });

  /*  Wake Up Blocking Threads

    Interrupt can immediately stop waiting operations like:

    sleep()
    wait()
    join()

    by throwing InterruptedException.
    */


}
