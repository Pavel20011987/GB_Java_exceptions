package task_3;

import java.util.ArrayList;

public class FindElementsIndex {
    /**
     * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
     * Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
     * если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
     * если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
     * если вместо массива пришел null, метод вернет -3
     * придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
     */

    public int getIndex(ArrayList<Integer> numbers, int n){
        int minArraysLength = 3;
        int maxArraysLength = 6;

        if(numbers == null){
            return -3;
        }

        if(numbers.size() < minArraysLength){
            return -1;
        }

        if(numbers.size() > maxArraysLength){
            return -4;
        }

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i).equals(n)){
                return i;
            }
        }
        return -2;
    }
}
