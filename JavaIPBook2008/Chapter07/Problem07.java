import java.util.Arrays;
import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of elements in array:");

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int minIndex = 0;
        int swap = 0;

        System.out.println("Enter elements in array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = swap;
        }

        // Show sorted array
        System.out.println(Arrays.toString(arr));
    }
}
