package HW_2;/*
Задание:
Если необходимо, исправьте данный код:
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
*/

public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 2;
            int[] Array = new int[6];
            double catchedRes1 = Array [4] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (Throwable e) {
            System.out.println("Catching exception: " + e);
        }
    }
}