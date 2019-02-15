public class Problem10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Swap
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
