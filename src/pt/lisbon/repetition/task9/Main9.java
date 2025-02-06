package pt.lisbon.repetition.task9;

public class Main9 {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 6, 7, 3, 8, 4, 9, 2, 3};
        System.out.println("Massive 1: ");
        for (int number : numbers){
            System.out.print(number + " ");
        }

        System.out.println("\nMassive 2:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[numbers.length - i - 1] + " ");
        }
    }
}
