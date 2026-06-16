package serialization;

import java.io.*;

// allows to convert the object into byte streams
/*    1. We can save to a file
 *     2. Send over a network
 *     3. Stored on database or cache*/

/*
    1. Capture the object state
        All instance variables (fields) of the object are written into a byte stream
    2. Preserve object structure
        Object relationships (like references to other objects) can also be stored
    3. Enable object persistence
        You can store objects beyond program execution (e.g., in files)
    4. Enable object transfer
        Send objects between JVMs (e.g., client-server apps, RMI, sockets)*/

class Data implements Serializable{


    int value;

    public Data(int value) {
        this.value = value;
    }
}

public class SerializationExample {

    static void main() throws IOException, ClassNotFoundException {

        Data data = new Data(10);

        File file = new File("src/serialization/file.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(data);

        Data datacopy;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        datacopy = (Data) ois.readObject();
        System.out.println(datacopy.value);

    }
}
