package collection.queue;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
    A ConcurrentLinkedQueue is a FIFO queue that works safely in multithreaded environments without locks.

    no wait or lock used threads run concurrently

    Provides weakly consistent iterators that do not throw ConcurrentModificationException.

    CAS (Compare-And-Set) is an atomic operation used in concurrent programming to update a value without using a lock.

    algorithm would be like :
               -- CAS(memoryLocation, expectedValue, newValue) --
                if memoryLocation == expectedValue
                    then return true and update newValue
                    else false

* */
public class ConcurrentLinkedQueueExample {

    public static void run(){

        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>(); //uses nodes with next

        // also

        ConcurrentLinkedDeque<Integer> queue2 = new ConcurrentLinkedDeque<>(); //nodes have previous also
    }
}
