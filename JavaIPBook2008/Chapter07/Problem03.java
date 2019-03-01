import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isEqual = true;
        System.out.println("Number of elements in array:");
        int n = scanner.nextInt();
        char[] arr1 = new char[n];
        char[] arr2 = new char[n];
        byte bigger = 0; // 1 or 2 (first or second array)

        System.out.println("Enter elements in first array:");

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.next().charAt(0);
        }

        System.out.println("Enter elements in second array:");

        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.next().charAt(0);
        }

        // Compare
        for (int i = 0; i < n; i++) {
            if (arr1[i] > arr2[i]) {
                bigger = 1;
                break;
            } else if(arr1[i] < arr2[i]) {
                bigger = 2;
                break;
            }
        }

        if (bigger == 0) {
            System.out.println("Two arrays are equal");
        } else {
            System.out.printf("Bigger in lexicographical order is %d array \n", bigger);
        }
    }
}
