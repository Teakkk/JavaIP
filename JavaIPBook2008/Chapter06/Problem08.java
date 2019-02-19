import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        double sum = 0;

        if (!(n >= 0)) {
            System.out.println("Invalid input!");
        } else {
            for (int i = 0; i <= n; i++) {
                sum += (factoriel(i)) / Math.pow(x,i);
            }

            System.out.println("Sum: " + sum);
        }

    }

    private static int factoriel(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
