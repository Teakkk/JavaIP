import java.util.Random;
import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int number = 0;

        Random rand = new Random();

        number = rand.nextInt(n) + 1;

        System.out.println(number);
    }
}
