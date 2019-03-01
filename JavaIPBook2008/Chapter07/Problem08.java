import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of elements in array:");

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int currentCounter = 0;
        int maxCounter = 0;
        int maxNumber = 0;

        System.out.println("Enter elements in array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            currentCounter = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    currentCounter++;
                }
            }
            if (currentCounter > maxCounter) {
                maxCounter = currentCounter;
                maxNumber = arr[i];
            }
        }

        if (maxCounter == 0 && maxNumber == 0) {
            System.out.println("No result");
        } else {
            System.out.printf("The number %d is %d times", maxNumber, maxCounter);
        }
    }
}
