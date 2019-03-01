import java.util.Arrays;
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of elements in array:");
        int n = scanner.nextInt();
        System.out.println("K:");
        int k = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort array
        Arrays.sort(arr);

        // Find k elements with max sum
        for (int i = n - 1; i >= (n-k); i--) {
            System.out.println(arr[i]);
        }
    }
}
