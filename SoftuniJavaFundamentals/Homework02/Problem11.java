import java.util.ArrayList;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int targetFindNumbers = 0;
        boolean findEven;

        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Skip word "Get"
        scanner.next();

        // Get number
        targetFindNumbers = scanner.nextInt();

        // Option - Even or Odd
        findEven = (scanner.next().equals("even"));

        result = getFirstElements(numbers, targetFindNumbers, findEven);

        System.out.println(result);
    }

    public static boolean isEven(int num)
    {
        return (num % 2 == 0);
    }

    public static ArrayList<Integer> getFirstElements(ArrayList<Integer> numbers, int targetFindNumbers, boolean findEven) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int totalFoundNumbers = 0;
        int totalNumbers = numbers.size();

        // Find first N even numbers
        if (findEven) {
            for (int i = 0; i < totalNumbers; i++) {
                if (isEven(numbers.get(i))) {
                    result.add(numbers.get(i));
                    totalFoundNumbers++;

                    if (totalFoundNumbers == targetFindNumbers) {
                        break;
                    }
                }
            }
        }

        // Find first N odd numbers
        if (!findEven) {
            for (int i = 0; i < totalNumbers; i++) {
                if (!isEven(numbers.get(i))) {
                    result.add(numbers.get(i));
                    totalFoundNumbers++;

                    if (totalFoundNumbers == targetFindNumbers) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}
