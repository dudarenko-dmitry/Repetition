package pt.lisbon.repetition.task2;

public class Main2 {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 6, 7, 3, 8, 4, 9, 2, 3};
        int sum = 0;
        for (int number : numbers) {
//            System.out.println("Element " + i + " = " + numbers[i]);
            sum = sum + number;
        }
        System.out.println("Sum of all elements = " + sum);
    }
}
