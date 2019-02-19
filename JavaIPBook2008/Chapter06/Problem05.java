import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        int current = 0;
        int last = 0;
        int lastLast = 0;

        if (n == 1) {
            sum = 0;
            System.out.println("Sum: " + sum);
        } else if (n == 2) {
            sum = 0 + 1;
            System.out.println("Sum: " + sum);
        } else if (n > 2) {
            lastLast = 0;
            last = 1;
            sum = 1;

            for (int i = 2; i < n; i++) {
                current = last + lastLast;
                lastLast = last;
                last = current;

                sum += current;
                System.out.println(current);
            }

            System.out.println("Sum: " + sum);
        }


    }
}
