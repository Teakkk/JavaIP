import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sum:");
        int targetSum = scanner.nextInt();

        System.out.println("Number of elements in array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int currentSum = 0;
        int indexFirst = 0;
        int indexLast = 0;

        System.out.println("Enter elements in array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                if (currentSum == targetSum) {
                    indexFirst = i;
                    indexLast = j;
                    break;
                }
            }
        }

        for (int i = indexFirst; i <= indexLast; i++) {
            System.out.println(arr[i]);
        }
    }
}
