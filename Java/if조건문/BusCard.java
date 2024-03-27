package javaStudy0314;

import java.util.Scanner;
public class BusCard {
    public static String getRole(int age) {
       if (age <= 5) {
           return "유아";
       } else if (age > 5 && age < 13) {
           return "어린이";
       } else if (age > 12 && age < 17) {
           return "청소년";
       } else {
           return "성인";
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String role = getRole(age); // getRole클래스에 사용자로부터 입력받은 age를 보냄
        System.out.println(role);
    }
}

