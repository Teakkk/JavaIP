import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double f1 = Math.pow(((a*a + b*b)/(a*a - b*b)),((a+b+c)/(Math.sqrt(c))));
        double f2 = Math.pow((a*a + b*b - c*c*c),(a-b));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, Math.abs(average(a,b,c) - average(f1,f2)));
    }

    // Override
    public static double average(double a, double b, double c) {
        return ((a + b + c) / 3);
    }

    // Override
    public static double average(double a, double b) {
        return ((a + b) / 2);
    }
}
