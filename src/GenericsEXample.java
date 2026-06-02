import java.util.ArrayList;
import java.util.List;

public class GenericsEXample {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(1);
        list.add(1);

        Integer i = (Integer) list.get(0);
        System.out.println(i);


    }
}
