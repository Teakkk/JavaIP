public class Problem09 {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        if ((x*x + y*y < 25) && (x < -1 || x > 5 || y < 1 || y > 5)) {
            System.out.println("In circle and outside rectangle");
        } else {
            System.out.println("Not in circle or in rectangle");
        }
    }
}
