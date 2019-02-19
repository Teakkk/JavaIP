import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inDecimal = scanner.nextInt();
        int num = inDecimal;
        String inHex = "";
        char c = 'A';

        while (num > 0) {
            switch(num % 16) {
                case 10:
                    inHex = inHex + 'A';
                    break;
                case 11:
                    inHex = inHex + 'B';
                    break;
                case 12:
                    inHex = inHex + 'C';
                    break;
                case 13:
                    inHex = inHex + 'D';
                    break;
                case 14:
                    inHex = inHex + 'E';
                    break;
                case 15:
                    inHex = inHex + 'F';
                    break;
                default:
                    inHex = inHex + (num % 16);
                    break;
            }
            num /= 16;
        }

        inHex = new StringBuilder(inHex).reverse().toString();
        System.out.println(inHex);
    }
}
