import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inHex = scanner.nextLine();
        int length = inHex.length();
        int inDecimal = 0;
        int num = 0;

        for (int i = 0; i < length; i++) {
            switch (inHex.charAt(length - i - 1)) {
                case 'A':
                    num = 10;
                    break;
                case 'B':
                    num = 11;
                    break;
                case 'C':
                    num = 12;
                    break;
                case 'D':
                    num = 13;
                    break;
                case 'E':
                    num = 14;
                    break;
                case 'F':
                    num = 15;
                    break;
                default:
                    num = Character.getNumericValue(inHex.charAt(length - i - 1));
                    break;
            }
            inDecimal += num * Math.pow(16,i);
        }

        System.out.println(inDecimal);
    }
}
