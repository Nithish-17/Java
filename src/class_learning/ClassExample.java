package class_learning;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class One{

    public static String name = "Nithiesh";

    public One(String name) {
        this.name = name;
    }

    public One(){
        this.name = "Nithiesh";
    }

    public void age(){
        System.out.println("21");
    }

    public void hobby(){
        System.out.println("video games");
    }




}

/*
* on java each class also have object of Class which is also a class
* it is for metadata of classes required by jvm
*  (.class) literal returns the particular Class obj of the class
*/


public class ClassExample {

    static void main() {



        One one = new One();
        // it does return a Class<?> object
        // Class is a class which have the metadata of class
        // we can also use One.class

        Class<?> c = one.getClass();
        System.out.println(One.class);
        System.out.println(c.getName());

        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
        }
    }
}
