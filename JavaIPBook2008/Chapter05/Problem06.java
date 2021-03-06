import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.abs(scanner.nextInt());
        }

        max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(max);
    }
}
