public class Problem11 {
    public static void main(String[] args) {
        int n = 35; // 35 = 00100011
        int p = 6;
        int i = 1; // 00000001
        int mask = i << p; // Move the 1st bit with p positions

        System.out.println((n & mask) != 0 ? 1 : 0);
    }
}
