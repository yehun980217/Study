package javaStudy0314;

import java.util.Scanner;
public class BMICalculator {

    public static double calculateBMI(double weight, double tall) {
        return weight / (tall * tall);
    }
    public static void printBMIClassification(double bmi) {
        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi > 18.4 && bmi < 25) {
            System.out.println("정상");
        } else if (bmi > 24 && bmi < 30) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("체중을 입력하세요");
        double weight = input.nextDouble();
        System.out.println("키를 입력하세요(m단위 예: 180cm => 1.8)");
        double tall = input.nextDouble();
        // BMI 지수 계산
        double bmi = calculateBMI(weight, tall);
        // BMI 지수를 입력하여 비만도 결과 출력
        printBMIClassification(bmi);
    }
}
