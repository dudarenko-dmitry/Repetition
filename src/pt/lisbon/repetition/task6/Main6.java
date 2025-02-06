package pt.lisbon.repetition.task6;

public class Main6 {

    public static void main(String[] args) {

        int [][] numbers = {{1,3,5},{2,6,8},{4,1,5}};
        System.out.println("the first massive:");
        for (int[] numbersRow : numbers) {
            System.out.print("| ");
            for (int i : numbersRow) {
                System.out.print(i + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }

        System.out.println();
        System.out.println("new massive:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = numbers[i][j] * 2;
                System.out.print(numbers[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
