import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = scanner.nextInt();

        if (!(points >= 1 && points <= 9)) {
            System.out.println("Enter points between [1;9]");
        } else {
            if (points >= 1 && points <= 3) {
                points *= 10;
            }

            if (points >= 4 && points <= 6) {
                points *= 100;
            }

            if (points >= 7 && points <= 9) {
                points *= 1000;
            }

            System.out.println(points);
        }
    }
}
