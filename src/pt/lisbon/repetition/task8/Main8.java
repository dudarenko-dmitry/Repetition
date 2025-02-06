package pt.lisbon.repetition.task8;

public class Main8 {

    public static void main(String[] args) {

        int[] numbers1 = {1,2,3,4,5};
        System.out.println("Massive 1:");
        for (int number : numbers1) {
            System.out.print(number + " ");
        }

        System.out.println();
        int length = numbers1.length;
        int[] numbers2 = new int[length];
        numbers2[0] = numbers1[length - 1];
        System.arraycopy(numbers1, 0, numbers2, 1, length - 1);

        System.out.println("\nMassive 2:");
        for (int number : numbers2) {
            System.out.print(number + " ");
        }

    }
}
