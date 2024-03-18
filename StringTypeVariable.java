package variables;

public class StringTypeVariable {

    public static void main(String[] args) {

        String str1 = "난생처음 "; // 문자열 변수 str1에 난생처음이라는 문자열 기입
        String str2 = "자바"; // 문자열 변수 str2에 자바라는 문자열 기입

        System.out.println(str1); // 출력값 : 난생처음
        System.out.println(str2); // 출력값 : 자바

        String result = str1 + str2; // 문자 + 문자이기에 사칙연산 +가 아닌 문자끼리 연결하는 +
        System.out.println(result); // 출력값 : 난생처음자바
    }
}