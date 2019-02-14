import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int result = 0;
        int i = 0;

        while (num > 0) {
            result = (result * 10) + (num % 7);
            num /= 7;
        }

        int reversedResult = 0;

        while (result > 0) {
            reversedResult = (reversedResult * 10) + (result % 10);
            result /= 10;
        }

        System.out.println(reversedResult);
    }
}
