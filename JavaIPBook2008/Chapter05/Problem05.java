import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double D = b*b  - 4*a*c;
        double x1 = 0;
        double x2 = 0;

        if (D < 0) {
            System.out.println("No real roots");
        } else if (D == 0) {
            x1 = (-b) / (2 * a);
            System.out.println(x1);
        } else {
            x1 = ((-b) + Math.sqrt(D)) / (2 * a);
            x2 = ((-b) - Math.sqrt(D)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
