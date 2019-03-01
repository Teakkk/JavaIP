import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of elements in array:");

        int n = scanner.nextInt();
        int[] arr = new int[n];
        boolean isSearching = false;
        int currentFirstIndex = 0;
        int currentLastIndex = 0;
        int currentTotal = 0;
        int maxFirstIndex = 0;
        int maxLastIndex = 0;
        int maxTotal = 0;

        System.out.println("Enter elements in array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find max number row
        for (int i = 0; i < n - 1; i++) {
            if (isSearching == false) {
                if (arr[i] == arr[i+1]) {
                    currentFirstIndex = i;
                    currentTotal = 1;
                    isSearching = true;
                }
            } else {
                if (arr[i] == arr[i+1]) {
                    currentTotal++;
                } else {
                    // case: isSearching == true but current and next elements are not equal
                    isSearching = false;
                    currentLastIndex = i;

                    if (currentTotal > maxTotal) {
                        maxFirstIndex = currentFirstIndex;
                        maxLastIndex = currentLastIndex;
                        maxTotal = currentTotal;
                    }
                    currentTotal = 0;
                }
            }
        }

        if (isSearching == true) {
            currentLastIndex = n - 1;
            if (currentTotal > maxTotal) {
                maxFirstIndex = currentFirstIndex;
                maxLastIndex = currentLastIndex;
                maxTotal = currentTotal;
            }
        }

        if (maxFirstIndex == maxLastIndex) {
            System.out.println("No number row with equal elements");
        } else {
            for (int i = maxFirstIndex; i <= maxLastIndex; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
