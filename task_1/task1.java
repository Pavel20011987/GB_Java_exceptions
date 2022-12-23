package task_1;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        ArrayList <Integer> someArray = new ArrayList<>();
        someArray.add(1);
        someArray.add(2);
        someArray.add(3);
        someArray.add(4);
        someArray.add(5);

        isLessLengthArray isLessLeenArr = new isLessLengthArray();

        System.out.println(isLessLeenArr.checkLength(someArray));

    }
}
