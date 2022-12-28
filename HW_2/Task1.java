package HW_2;/*
Задание:
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.printf("Корректное рациональное число: %s%n", ((Float)myGetFloat()).toString());
    }

    public static float myGetFloat() {
        boolean exit = false;
        float fNumber = 0;
        Scanner scan = new Scanner(System.in);
        while (!exit) {
            System.out.print("Введите рациональное число: ");
            String input = scan.nextLine();
            try {
                fNumber = Float.parseFloat(input);
                exit = true;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат для рационального числа. Повторите ввод!");
            }
        }
        return fNumber;
    }
}