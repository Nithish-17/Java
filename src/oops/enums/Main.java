package oops.enums;

import java.util.PriorityQueue;

public class Main {

    // ===== ENUM DECLARATION =====
    enum Level {

        // ----- ENUM CONSTANTS (OBJECTS) -----
        LOW(1) {
            @Override
            public String behaviour() {
                return "Low intensity work";
            }
        },

        MEDIUM(5) {
            @Override
            public String behaviour() {
                return "Medium intensity work";
            }
        },

        HIGH(10) {
            @Override
            public String behaviour() {
                return "High intensity work";
            }
        };

        // ----- FIELD (instance variable) -----
        private int value;

        // ----- CONSTRUCTOR -----
        // always private (implicitly)
        Level(int value) {
            this.value = value;
        }

        // ----- NORMAL METHOD -----
        public int getValue() {
            return value;
        }

        // ----- ABSTRACT METHOD -----
        // each constant MUST implement this
        public abstract String behaviour();

        // ----- OVERRIDE toString() -----
        @Override
        public String toString() {
            return "Level: " + name() + " (value=" + value + ")";
        }
    }
    // ===== MAIN METHOD =====
    public static void main(String[] args) {

        /// / an enum can extends an interface also................
        Level l = Level.MEDIUM;

        // object itself
        System.out.println(l);

        // name()
        System.out.println("name(): " + l.name());

        // ordinal()
        System.out.println("ordinal(): " + l.ordinal());

        // custom method
        System.out.println("value: " + l.getValue());

        // abstract method implementation
        System.out.println("behaviour: " + l.behaviour());

        // looping all enum objects
        System.out.println("\nAll Levels:");
        for (Level level : Level.values()) {
            System.out.println(level);
        }
  }
}
