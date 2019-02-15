public class Problem04 {
    public static void main(String[] args) {
        int num = 5;
        // Using bitwise.
        int thirdByte = ((num & 4) == 0) ? 0 : 1;

        // 4 = 0100
        // 5 = 0101 -> Third Byte is 1

        System.out.println(thirdByte);
    }
}
