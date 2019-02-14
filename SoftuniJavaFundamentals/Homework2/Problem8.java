import java.util.Scanner;
import java.util.ArrayList;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumbers = 0;
        int temp1 = 0;
        int temp2 = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // End loop when find "END"
        while (!scanner.hasNext("END")) {
            numbers.add(scanner.nextInt());
        }

        // Get total numbers
        totalNumbers = numbers.size();

        if (!isEven(totalNumbers)) {
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < totalNumbers; i += 2) {
                temp1 = numbers.get(i);
                temp2 = numbers.get(i + 1);

                if (isEven(temp1) && isEven(temp2)) {
                    System.out.printf("%d, %d -> both are even \n", temp1, temp2);
                } else if (!isEven(temp1) && !isEven(temp2)) {
                    System.out.printf("%d, %d -> both are odd \n", temp1, temp2);
                } else {
                    System.out.printf("%d, %d -> different \n", temp1, temp2);
                }
            }
        }
    }

    public static boolean isEven(int num)
    {
        return (num % 2 == 0) ? true : false;
    }
}
