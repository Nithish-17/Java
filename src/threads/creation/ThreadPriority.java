package threads.creation;
/*
Thread Priority
Let's say there are lø threads in runnable state, however, there is only one available CPU, so only one thread can
execute at a given time and others will have to wait. So who decides which thread gets to run on the CPU. This component
is called as Thread Scheduler.
Each thread has certain priority and under normal circumstance the thread with higher priority gets to run on the CPU
Priority value from 1 to 10 can be assigned to any thread. 1 priority is represented as MIN_PRIORITY and 10 priority is
represented as MAX_PRIORITY. By default, the priority of a thread is 5, it's represented as NORM _ PRIORITY.
Threads of the same priority value are executed in FIFO manner. The thread scheduler stores the threads in a queue.
Main thread have the priority of 5 but it was first executed by the program
*/


public class ThreadPriority {
    static void main() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());

    }
}
