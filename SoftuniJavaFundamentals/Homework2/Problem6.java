import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int result = 0;
        int i = 0;

        while (num > 0) {
            result += (num % 10) * Math.pow(7, i);
            i++;
            num /= 10;
        }

        System.out.println(result);
    }
}
