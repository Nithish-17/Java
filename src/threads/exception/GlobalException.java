package threads.exception;

class One extends Thread {
    @Override
    public void run() {
        int a = 10/0;
        System.out.println("hello");
    }
}

public class GlobalException {

    static void main() {

        // --------------------- this is a global uncaught exception handler across the program ------------------
        Thread.setDefaultUncaughtExceptionHandler(
                (t,e) ->
                        System.out.println("Uncaught exception : " + e.getMessage()));


        /*

        -------this thread limited global exception handler -----------------
        Thread.currentThread().setUncaughtExceptionHandler(
            (t,e) ->
                    System.out.println("Uncaught exception : " + e.getMessage()));
        */


        //thread one exception
        One one = new One();
        one.start();


        //main thread exception
        String message = null;
        message.length();


        // the execution of the thread will stop after it encounters the first exception
    }
}
