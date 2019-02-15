import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        // Sum of digits
        int sum = 0;
        int num1 = num; // Copy of original num
        while (num1 > 0) {
            sum += num1 % 10;
            num1 /= 10;
        }

        // Reverse number
        int reversed = 0;
        int num2 = num; // Copy of original num
        while (num2 > 0) {
            reversed = (reversed * 10) + (num2 % 10);
            num2 /= 10;
        }

        // Last digit on first place
        int lastDigitFirstPlace = num;
        int lastDigit = lastDigitFirstPlace % 10;
        lastDigitFirstPlace /= 10;
        lastDigitFirstPlace += lastDigit * 1000;

        // Swap second and third digit
        int swapped = 0;
        int digit1 = num / 10 / 10 / 10 % 10;
        int digit2 = num / 10 / 10 % 10;
        int digit3 = num / 10 % 10;
        int digit4 = num % 10;
        swapped = digit1 * 1000 + digit3 * 100 + digit2 * 10 + digit4;

        // Show results
        System.out.println(sum);
        System.out.println(reversed);
        System.out.println(lastDigitFirstPlace);
        System.out.println(swapped);
    }
}
