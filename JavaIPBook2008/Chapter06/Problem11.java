import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int fact = factoriel(n);
        int counter = 0;

        // Factorial of N ends with so much zero digits as number is divides by 5
        while (fact % 5 == 0) {
            fact /= 5;
            counter++;
        }

        System.out.println(counter);
    }

    private static int factoriel(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
