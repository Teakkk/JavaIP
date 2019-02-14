import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextInt();
        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out.println(perimeter);
        System.out.println(area);
    }
}
