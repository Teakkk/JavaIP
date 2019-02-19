import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double result = 0;

        if (!(n >= 0)) {
            System.out.println("Invalid input!");
        } else {
            // Catalan's numbers
            result = (factoriel(2*n)) / (factoriel(n+1) * factoriel(n));
            System.out.println(result);
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
