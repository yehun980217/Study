public class HourglassStar {

    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            if (i == 4) System.out.print(" ");
            else if(i == 3) System.out.print("  ");
            else if(i == 2) System.out.print("   ");
            else if(i == 1) System.out.print("    ");
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");

            if(i == 1) {
                for (int x = 2; x < 6; x++) {
                    if (x == 2) System.out.print("   ");
                    if (x == 3) System.out.print("  ");
                    if (x == 4) System.out.print(" ");
                    for (int y = 1; y <= x * 2 - 1; y++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
        }
    }
}
