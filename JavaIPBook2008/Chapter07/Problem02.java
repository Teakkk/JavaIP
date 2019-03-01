import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isEqual = true;
        System.out.println("Number of elements in array:");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter elements in first array:");

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements in second array:");

        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Compare two arrays
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            System.out.println("Two arrays are equal");
        } else {
            System.out.println("Two arrays are not equal");
        }
    }
}

