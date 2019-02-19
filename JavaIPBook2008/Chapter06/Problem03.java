import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int temp = 0;
        int min = 0;
        int max = 0;

        System.out.println("Total numbers: ");
        n = scanner.nextInt();

        if (n == 1) {
            temp = scanner.nextInt();
            min = max = temp;
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        } else if (n > 1) {
            // First number
            temp = scanner.nextInt();

            // Makes first number to be min and max
            min = max = temp;

            // Enter others number and find min and max
            for (int i = 1; i < n; i++) {
                temp = scanner.nextInt();

                if(temp > max) {
                    max = temp;
                }

                if (temp < min) {
                    min = temp;
                }
            }

            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        } else {
            // n <= 0
            System.out.println("Invalid total numbers!");
        }
    }
}
