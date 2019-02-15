public class Problem12 {
    public static void main(String[] args) {
        int n = 35; // 00100011
        int p = 2;
        int v = 1; // 0 or 1

        int mask = v << p;
        n = n & (~(1 << p));
        int result = n | mask;

        System.out.println(result);
    }
}
