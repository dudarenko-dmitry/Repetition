package pt.lisbon.repetition.task5;

public class Main5 {
    public static void main(String[] args) {

        int[] numbers = new int[20];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random()*100 + 1);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int even = 0;
        int odd = 0;

        for(int number : numbers) {
            if (number%2 > 0) {
                odd++;
            } else {
                even++;
            }
        }

        System.out.println("Quantity of odd numbers is " + odd);
        System.out.println("Quantity of even numbers is " + even);

    }
}
