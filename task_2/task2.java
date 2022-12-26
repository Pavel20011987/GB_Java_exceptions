package task_2;

import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        FindElementsIndex index = new FindElementsIndex();
        ArrayList<Integer> someArray = new ArrayList<>();
        someArray.add(1);
        someArray.add(2);
        someArray.add(3);
        someArray.add(4);
        someArray.add(5);
        someArray.add(1);
        someArray.add(2);
        someArray.add(3);
        someArray.add(4);
        someArray.add(5);

        System.out.println(index.getIndex(someArray, 10));

    }
}
