import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = 0;

        if (!(k > 1 && k < n) || !(n > 0 && k > 0)) {
            System.out.println("Invalid input!");
        } else {
            result = factoriel(n) / factoriel(k);
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
