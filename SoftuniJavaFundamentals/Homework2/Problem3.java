import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        String value1 = Integer.toString(a, 16).toUpperCase();
        String value2 = Integer.toString(a, 2);
        String value3 = String.format("%.2f", b);
        String value4 = String.format("%.3f", c);

        String column1 = value1 + repeat(" ", (10 - value1.length()));
        String column2 = repeat("0", (10 - value2.length())) + value2;
        String column3 = repeat(" ", (10 - value3.length())) + value3;
        String column4 = value4 + repeat(" ", (10 - value4.length()));

        String result = "|" + column1 + "|" + column2 + "|" + column3 + "|" + column4 + "|";

        System.out.println(result);
    }

    public static String repeat(String word, int n)
    {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += word;
        }

        return result;
    }
}
