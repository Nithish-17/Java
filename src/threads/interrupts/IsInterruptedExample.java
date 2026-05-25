package threads.interrupts;

public class IsInterruptedExample {
    Thread two = new Thread(()->{
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("interrupted + current loop remainings");;
                //when exception is thrown the flag reset to false
                Thread.currentThread().interrupt();
            }
            System.out.println("i am going to run infinite times"); // it will execute one last time becuase it was on current loop
        }
    });
}
