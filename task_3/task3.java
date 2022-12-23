package task_3;


import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        ArrayList<Integer> someArray = new ArrayList<>();
        someArray.add(1);
        someArray.add(2);
        someArray.add(3);
        someArray.add(4);
        someArray.add(5);

        System.out.println(userInput.input(someArray));
    }
}
