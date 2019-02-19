import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inBinary = scanner.nextLine();
        int length = inBinary.length();
        int inDecimal = 0;

        for (int i = 0; i < length; i++) {
            inDecimal += Character.getNumericValue(inBinary.charAt(length - i - 1)) * Math.pow(2,i);
        }

        System.out.println(inDecimal);
    }
}
