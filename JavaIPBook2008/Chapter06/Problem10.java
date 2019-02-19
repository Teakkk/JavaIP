import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (!(n > 0 && n < 20)) {
            System.out.println("Invalid input!");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n + i + 1; j++) {
                    System.out.printf("%d ", j);
                }
                System.out.println();
            }
        }
    }
}
