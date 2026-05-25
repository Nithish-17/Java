package oops;
import java.util.Arrays;

class CustomArray<T>{
    private Object[] array;
    private int index = 0;
    public CustomArray(){
        this.array = new Object[10];
    }
    public void  add(T value)
    {
        if(index == array.length)
            resize();
        array[index++] = value;
    }

    private void resize() {
        Object[] newArray;
        newArray = Arrays.copyOf(array, array.length*2);
        array = newArray;
    }
    public void get(int ind){
        System.out.println(array[ind]);
    }
    public void remove(){
        index -= 1;
    }

    @Override
    public String toString() {
        return "array=" + Arrays.toString(array);
    }
}

public class CustomGenericArrayList {
    static void main() {
    CustomArray<Integer> array = new CustomArray<>();
    array.add(1);
    array.add(2);
    array.add(3);
    System.out.println(array);
    }
}
