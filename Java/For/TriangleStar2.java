public class TriangleStar2 {

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i == 4) {
                for (int x = 3; x >= 1; x--) {
                    for (int j = 1; j <= x; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}
