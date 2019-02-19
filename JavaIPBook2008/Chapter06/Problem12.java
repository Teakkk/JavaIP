import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inDecimal = scanner.nextInt();
        int num = inDecimal;
        String inBinary = "";

        while (num > 0) {
            inBinary = inBinary + (num % 2);
            num /= 2;
        }

        inBinary = new StringBuilder(inBinary).reverse().toString();
        System.out.println(inBinary);
    }
}
