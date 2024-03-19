public class TriangleStar {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 1) System.out.print("    ");
            else if (i == 2) System.out.print("   ");
            else if (i == 3) System.out.print("  ");
            else if (i == 4) System.out.print(" ");
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
