package scanners;

import java.util.Scanner;

public class ScannerExam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("실수를 입력하세요.");
        double num = sc.nextDouble(); // 묵시적 형변환 double가 int보다 더 큰 메모리 공간을 확보하고 있기에 따로 형변환을 안해줘도 된다
        System.out.println("사용자가 입력한 값 ==> " + num);

        System.out.println("문자열을 입력하세요.");
        String str = sc.next(); // 숫자를 입력받아도 숫자 2가 아닌 문자 "2"로 받음
        System.out.println("사용자가 입력한 값 ==> " + str);

        sc.close();
    }
}
