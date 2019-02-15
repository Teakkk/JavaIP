import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = i; j < 3; j++) {
                sum += numbers[j];
                if (sum == 0) {
                    System.out.print("Subset found: ");
                    for (int k = i; k < 3; k++) {
                        System.out.print(numbers[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
