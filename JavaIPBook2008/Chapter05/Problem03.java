import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = a;

        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        if (max < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        System.out.println(max);

    }
}
