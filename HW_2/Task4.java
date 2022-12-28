package HW_2;/*
Задание:
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        boolean exit = false;
        String result = "";
        while (!exit) {
            try {
                result = myGetNotEmptyString();
                exit = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Нельзя вводить пустые строки! Повторите ввод!");
            }
        }
        System.out.printf("Введена строка: %s%n", result);
    }

    public static String myGetNotEmptyString() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите непустую строку: ");
        String input = scan.nextLine();
        if (input.length()<1) {
            throw new IllegalArgumentException("String is empty");
        }
        return input;
    }
}