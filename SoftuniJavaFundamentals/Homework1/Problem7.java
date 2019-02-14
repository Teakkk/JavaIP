import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int num2 = 0;
        String ghetto = "";

        // Reverse user number. Ex: 123 -> 321
        while (num > 0) {
            num2 = (num2 * 10) + (num % 10);
            num /= 10;
        }

        // Get digits from number and add to string
        while (num2 > 0) {
            switch (num2 % 10) {
                case 0:
                    ghetto += "Gee";
                    break;
                case 1:
                    ghetto += "Bro";
                    break;
                case 2:
                    ghetto += "Zuz";
                    break;
                case 3:
                    ghetto += "Ma";
                    break;
                case 4:
                    ghetto += "Duh";
                    break;
                case 5:
                    ghetto += "Yo";
                    break;
                case 6:
                    ghetto += "Dis";
                    break;
                case 7:
                    ghetto += "Hood";
                    break;
                case 8:
                    ghetto += "Jam";
                    break;
                case 9:
                    ghetto += "Mack";
                    break;
                default:
                    break;
            }
            num2 /= 10;
        }

        System.out.println(ghetto);
    }
}
