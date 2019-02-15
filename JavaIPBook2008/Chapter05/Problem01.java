import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int swap = 0;

        if (a > b) {
            swap = a;
            a = b;
            b = swap;
        }

        System.out.println(a);
        System.out.println(b);
    }
}
