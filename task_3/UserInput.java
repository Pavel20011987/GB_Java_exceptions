package task_3;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    /**
     * Напишите метод, в котором реализуйте взаимодействие с пользователем.
     * То есть, этот метод запросит искомое число у пользователя, вызовет первый,
     * обработает возвращенное значение и покажет читаемый результат пользователю.
     * Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
     *
     * @param arrayNumbers - массив, где будет выполняться поиск
     */
    public String input(ArrayList<Integer> arrayNumbers) {
        FindElementsIndex findIndex = new FindElementsIndex();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомое число: ");
        int number = scanner.nextInt();

        int result = findIndex.getIndex(arrayNumbers, number);

        if (result >= 0) {
            return "Индекс искомого числа: " + result;
        } else {
            if (result == -1) {
                return "Длинна массива меньше заданного минимума (3)";
            } else if (result == -2) {
                return "Искомый элемент не найден";
            } else if (result == -3) {
                return "вместо массива пришел null";
            } else if (result == -4) {
                return "Длинна массива больше заданного максимума (6)";
            }
            return "Неизвестная ошибка";
        }
    }
}
