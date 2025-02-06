package pt.lisbon.repetition.task4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input word --> ");
        String word = scanner.nextLine();
        byte[] letters = word.getBytes();
        for(int i = 0; i < letters.length/2; i++) {
            if(letters[i] != letters[letters.length - i - 1]) {
                System.out.println("This word is not a palindrome");
                System.exit(0);
            }
        }
        System.out.println("This word is a palindrome");
    }
}

