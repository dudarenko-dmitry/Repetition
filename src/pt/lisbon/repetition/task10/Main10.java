package pt.lisbon.repetition.task10;

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number --> ");
        int nn = scanner.nextInt();

        int[] numbers = new int[nn];
        if (nn == 0) {
            System.out.println("your input is not correct");
        } else {
            System.out.println("Fibonachi numbers: ");
            numbers[0] = 0;
            System.out.print(numbers[0] + " ");
            if (nn <= 2) {
                numbers[1] = 1;
                System.out.print(numbers[1] + " ");
            } else {
                numbers[1] = 1;
                for (int i = 2; i != nn; i++) {
                    numbers[i] = numbers[i - 1] + numbers[i - 2];
                }
            }
            for (int i = 1; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
