public class Problem7 {
    public static void main(String[] args) {
        double weightOnEarth = 65;
        double weightOnMoon = (weightOnEarth / 9.81) * 1.622;
        System.out.printf("%.2f", weightOnMoon);
    }
}
