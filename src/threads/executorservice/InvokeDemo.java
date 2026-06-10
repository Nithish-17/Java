package threads.executorservice;

import java.util.List;
import java.util.concurrent.*;

public class InvokeDemo {
    static void main()  {

        //invoke all returns total results after running all tasks
        try (ExecutorService executorService = Executors.newFixedThreadPool(5)) {

            //crating tasks lambda on list
            List<Callable<Integer>> task = List.of(
                    () -> 10,
                    () -> 20,
                    () -> 30,
                    () -> 40,
                    () -> 50
            );
            List<Future<Integer>> result = executorService.invokeAll(task);

            for (Future<Integer> f : result)
                System.out.println(f.get());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //invoke any retuns the value of first runned task and stops the remaining task
        try(ExecutorService executorService = Executors.newFixedThreadPool(5)) {
            List<Callable<String>> task = List.of(
                    () -> "one",
                    () -> "two",
                    () -> "three",
                    () -> "four",
                    () -> "five"
            );
            String result = executorService.invokeAny(task); //returns the actual wrapper object
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
