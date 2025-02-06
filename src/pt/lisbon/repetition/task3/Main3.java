package pt.lisbon.repetition.task3;

public class Main3 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random()*10 + 1);
            System.out.println("element " + (i+1) + " = " + numbers[i]);
        }
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max number = " + max);
    }
}
