package threads.interrupts;

public class Main {
    static void main() throws InterruptedException {
        InterruptExample interruptExample = new InterruptExample();
        interruptExample.one.start();
        interruptExample.one.interrupt(); // setting the thread one interrupt flag to true
        IsInterruptedExample isInterruptedExample = new IsInterruptedExample();
        isInterruptedExample.two.start();
        Thread.sleep(2000);
        isInterruptedExample.two.interrupt();

        //one more function Thread.currentThread().Interrupted() -- will checks the current flag value and reset to false


    }
}
