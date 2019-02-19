public class Problem04 {
    public static void main(String[] args) {
        // Color of cards -> s = spades, h = hearts, d = diamonds, c = clubs
        char color = 's';
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    color = 's';
                    break;
                case 2:
                    color = 'h';
                    break;
                case 3:
                    color = 'c';
                    break;
                case 4:
                    color = 'h';
                    break;
                default:
                    break;

            }
            for (int j = 1; j <= 13; j++) {
                switch (j) {
                    case 1:
                        System.out.printf("A%s ", color); // Ex: Ad = Ace Diamonds
                        break;
                    case 11:
                        System.out.printf("J%s ", color); // Jack
                        break;
                    case 12:
                        System.out.printf("Q%s ", color); // Queen
                        break;
                    case 13:
                        System.out.printf("K%s ", color); // King
                        break;
                    default:
                        System.out.printf("%d%s ", j, color);
                        break;
                }
            }
            System.out.println();
        }
    }
}
