import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Swap if n > m, to make sure that we will work with n which is smaller than m
        if (n > m) {
            n = n + m;
            m = n - m;
            n = n - m;
        }

        // Add all numbers from n to m to array
        for (int i = n; i <= m; i++) {
            numbers.add(i);
        }

        // Shuffle elements in array
        Collections.shuffle(numbers);

        // Print result
        System.out.println(numbers);
    }
}
