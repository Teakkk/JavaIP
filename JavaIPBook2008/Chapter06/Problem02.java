import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (!(i % 7 == 0 || i % 3 == 0)) {
                System.out.println(i);
            }
        }
    }
}
