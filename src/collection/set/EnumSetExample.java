package collection.set;

/*
    the EnumSet is a specialized set implementation for use with enum types
    provides a highly optimized set for storing enum constants

    EnumSet is highly efficient and faster for enum types
    All the elements in an EnumSet must come from a single enumeration type
    It does not allow null elements and throws NullPointerException if we do so.
    EnumSet uses a weakly consistent iterator, not a fail-fast one—so it doesn’t throw ConcurrentModificationException and may reflect some modifications during iteration.(because it use snapshot of real copy during iteration)  
    Instead of storing objects like HashSet, it uses bits (bitmasking).
    follows enum declaration order

    best, average, and worst case are basically the same---- O(1)

    How it stores it is actually storing
*/

import java.util.EnumSet;

enum Permission {
    READ,
    WRITE,
    UPDATE,
    DELETE
}

public class EnumSetExample {

    public static void run(){

        EnumSet<Permission> admin = EnumSet.allOf(Permission.class);

        EnumSet<Permission> editor =
                EnumSet.of(
                        Permission.READ,
                        Permission.WRITE,
                        Permission.UPDATE
                );

        EnumSet<Permission> viewer = EnumSet.of(Permission.READ);

        System.out.println(admin);
        System.out.println(editor);
        System.out.println(viewer);

        /*
                ------ Internal Storing of the EnumSet--------

                Internally it uses a single variable to stores which enums are used

                enum Numbers {
                    ONE, TWO, THREE, FOUR, FIVE
                }

                     -----------internally-----------
                        5 digits for 5 values upto 64 values for 64 values then bukcets

                        if EnumSet has ONE, THREE, FIVE
                     long elements = 10101;

                     bits that were 1 was present

                     if i use EnumSet.contains(ONE) it will convert the ordinal number as 1 and then checks the first bits

                     if elements are more than 64 it use bucket
                        1.using division for finding bucket
                        2.using mod for finding the index on bucket

        */

    }
}

/*
    extra functions avaliable on Enumset

                        of()
                        allOf()
                        noneOf()
                        range()
                        complementOf()
                        copyOf()
                        clone()
    */
