package task_4;


public class SumTwoDimArray {
    public int getSumTwoDimArr(int[][] twoDimArr) {
        int sum_elems = 0;
        for (int[] array : twoDimArr) {
            if (array.length == twoDimArr.length) {
                for (int elem : array) {
                    if (elem == 0 | elem == 1) {
                        sum_elems += elem;
                    } else {
                        throw new RuntimeException("Элементами матрицы могут быть только 0 и 1");
                    }

                }

            } else {
                throw new RuntimeException("Матрица не квадратная");
            }
        }
        return sum_elems;
    }
}
