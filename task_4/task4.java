package task_4;

public class task4 {
    public static void main(String[] args) {
        int[][] twoDimArray1 = {{1, 1}, {0, 1}};
        int[][] twoDimArray2 = {{32, 65}, {17, 11}};
        int[][] twoDimArray3 = {{0, 1}, {1, 0}, {1, 1}};

        SumTwoDimArray sum = new SumTwoDimArray();

        System.out.println(sum.getSumTwoDimArr(twoDimArray1));
    }
}
