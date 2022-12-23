package task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class isLessLengthArray {
    /**
     * Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
     * Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки,
     * иначе - длину массива.
     */

    public int checkLength(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число - минимальную длину массива: ");
        int length = scanner.nextInt();

        if (numbers.size() < length) {
            return -1;
        } else {
            return numbers.size();
        }
    }
}
