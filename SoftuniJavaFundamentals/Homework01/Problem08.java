import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double avg = findAverage(a, b, c);

        System.out.printf("%.2f", avg);
    }

    public static double findAverage(double a, double b, double c)
    {
        double avg = (a + b + c) / 3;
        return avg;
    }
}
