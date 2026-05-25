package collections.streams;

//---- streams are lazy while optionals are eager-------
// we are using collections streams on Collection class
//Arrays are also has streams called Array.stream(arr)
//refer helper.txt for more streams


/*
streams in java is a interface
one of these three streams sub-class implementations object created based on our func usage
        ReferencePipeline.Head  -- Collection → Head      points to first element
        ReferencePipeline.StatelessOp -- Operations that do NOT need past or future elements
        ReferencePipeline.StatefulOp -- Operations that need past or future elements
*/

/*Stream = Pipeline for data processing
we cannot modify streams we can modify and create a new stream
streams are consumed once used and cannot be resued*/

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(3); list.add(2); list.add(5); list.add(6); list.add(4);
        Stream<Integer> stream = list.stream();
        Stream<Integer> stream1 = stream.sorted();
        stream1.forEach(System.out::println);
        Stream<Integer> stream3 = list.stream().distinct().sorted().map(i -> i*i);
        stream3.forEach(System.out::println);
    }
}
