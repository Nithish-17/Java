package collection.list;


/*
                Thread-safe version of ArrayList suitable for concurrent access.
                All update operations create a cloned copy of the underlying list.
                Iterators provide a snapshot and do not throw ConcurrentModificationException.

                during write it locks the locking object then it crates copy modifies the copy and then make it as original
                but read can be at done anytime
                so we can read and write at same time without any issue

*/

public class CopyOnWriteArrayListExample {
}
