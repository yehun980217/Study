package javaStudy0314;

import java.util.Scanner;

public class JavaCorporation {

    public static void   payCalculator(int workTime, int workPay) {

        if(workPay < 9860) System.out.println("최저시급 불이행");
        if(workTime > 60) System.out.println("근무시간 불이행");
        int weekPay = workTime * workPay;
        if(workTime > 40 && workTime < 60) {
            int overWorkTime = workTime - 40;
            double overWeekPay = overWorkTime * workPay * 1.5;
            System.out.println("이번주 주급은 " + (weekPay + overWeekPay) + "원 입니다");
        } else if (workPay >= 9860 && workTime < 60)
            System.out.println("이번 주 주급은 " + weekPay + "원 입니다");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("임금 계산기입니다");
        System.out.println("근무 시간을 입력해주세요");
        int workTime = sc.nextInt();
        System.out.println("시급을 입력해주세요");
        int workPay = sc.nextInt();

        payCalculator(workTime, workPay);
    }
}
