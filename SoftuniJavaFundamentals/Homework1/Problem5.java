import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        char c = 'a';

        for (int i = 1; i <= n; i++) {
            c = 'a';
            for (int j = 1; j <= i; j++) {
                System.out.printf("%s ", c);
                c += 1;
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            c = 'a';
            for (int j = 1; j <= i; j++) {
                System.out.printf("%s ", c);
                c += 1;
            }
            System.out.println();
        }
    }
}
