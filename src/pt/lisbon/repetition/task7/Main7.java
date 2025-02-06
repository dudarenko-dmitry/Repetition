package pt.lisbon.repetition.task7;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number --> ");
        int number = scanner.nextInt();
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println("N! = " + result);
    }
}
