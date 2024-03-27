package variables;

public class TypeChange {

    public static void main(String[] args) {
        int num1;
        double num2;
        String str;

        str = "1234";
        num1 = Integer.parseInt(str); // 문자열 "1234"를 정수형 1234로 변환
        System.out.println("문자열을 정수로 변환 ==> "  + num1);

        str = "3.14";
        num2 = Double.parseDouble(str); // 문자열 "3.14"를 실수형 3.14로 변환
        System.out.println("문자열을 실수로 변환 ==> " + num2);
    }
}
