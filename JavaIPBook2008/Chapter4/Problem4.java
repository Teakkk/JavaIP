import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int total = 0;

        for (int i = n; i <= m; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                total++;
            }
        }

        System.out.println("Total found: " + total);
    }
}
