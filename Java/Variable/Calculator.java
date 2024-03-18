package variables;

public class Calculator {

    public static void main(String[] args) {

        int num1, num2, result; // 정수형 변수 num1, num2, result 선언
        num1 = 10; // 정수형 변수 num1에 100을 기입
        num2 = 5; // 정수형 변수 num2에 50을 기입

        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);

        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);

        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);

        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
    }
}
