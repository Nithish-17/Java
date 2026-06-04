package class_learning;

import java.lang.reflect.InvocationTargetException;

class Student{

    String name;
    int age;
}

public class DynamicObjectCreationExample {

    static void main() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //loads the class and creates the class object
        Class<?> c = Class.forName("Student");

        //loads only the non parameterized constructor and creates object
        Object o = c.getDeclaredConstructor().newInstance();

    }
}
