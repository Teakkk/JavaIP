import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Point A
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        // Point B
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Point C
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Area
        int area = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2;

        // Print result
        System.out.println(Math.abs(area));
    }
}
