package serialization;

import java.io.*;


/*
    1. Extends Serializable
    2. Gives full control over serialization process
    3. You must manually define how object is saved and restored
    */


class Student implements Externalizable {
    int id;
    String name;

    // mandatory no-arg constructor
    public Student() {}

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        name = (String) in.readObject();
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class ExternalizableExample {

    public static void main(String[] args) {

        String fileName = "src/serialization/file.txt";

        // ===== Serialization =====
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            Student s1 = new Student(101, "Arun");
            out.writeObject(s1);

            System.out.println("Object serialized");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // ===== Deserialization =====
        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            Student s2 = (Student) in.readObject();

            System.out.println("Object deserialized");
            System.out.println(s2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}