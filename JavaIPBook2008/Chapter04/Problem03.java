import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String address = scanner.nextLine();
        String phone = scanner.nextLine();
        String fax = scanner.nextLine();
        String website = scanner.nextLine();
        String manager = scanner.nextLine();

        System.out.printf("Name: %s, Address: %s, Phone: %s, Fax: %s, Website: %s, Manager: %s", name, address, phone, fax, website, manager);
    }
}
