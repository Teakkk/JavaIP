import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.next();
        String s2 = scanner.next();

        System.out.println(charMultiplier(s1, s2));
    }

    public static int charMultiplier(String str1, String str2) {
        int sum = 0;
        int lengthStr1 = str1.length();
        int lengthStr2 = str2.length();
        int loopTo = ( lengthStr1 > lengthStr2 ) ? lengthStr1 : lengthStr2;
        int mult1 = 0;
        int mult2 = 0;

        for (int i = 0; i < loopTo; i++) {
            mult1 = 1;
            mult2 = 1;

            if (i < lengthStr1) {
                mult1 = (int) str1.charAt(i);
            }
            if (i < lengthStr2) {
                mult2 = (int) str2.charAt(i);
            }

            sum += (mult1 * mult2);
        }

        return sum;
    }
}
