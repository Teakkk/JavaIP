import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix size:");
        int n = scanner.nextInt();
        int num = 0; // helper that will fill matrix
        int dx = 0; // helper for c)

        int[][] arr = new int[n][n];

        // a)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][i] = ++num;
            }
        }
        System.out.println();
        System.out.println("a)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        // b)
        num = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[j][i] = ++num;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    arr[j][i] = ++num;
                }
            }
        }
        System.out.println();
        System.out.println("b)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        // c)
        num = 0;
        int br = 0;
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <= br; j++) {
                arr[i+j][j] = num;
                num++;
            }
            br++;
        }
        br = n-1;
        // е тоя цикъл не работи...
        for (int i = 0; i <= n-2; i++) {
            for (int j = 0; j <= br; j++) {
                arr[j][i+j] = num;
                num++;
            }
            br--;
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <= br; j++) {
                arr[i+j][j] = num;
                num++;
            }
            br++;
        }
        System.out.println();
        System.out.println("c)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
