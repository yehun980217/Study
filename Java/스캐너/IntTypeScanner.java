package scanners;

import java.util.Scanner;

public class IntTypeScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("사용자가 입력한 값 ==> " + num);

        sc.close();
    }




}
