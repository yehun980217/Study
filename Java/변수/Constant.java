package variables;

public class Constant {

    public static void main(String[] args) {
        // 상수란 변하지 않는 값으로 final int, final double 등 final을 붙여 선언하고 변수명은 대문자로 작성한다.
        final double PI = 3.14159;
        int radius = 5;
        double result = radius * 2 * PI;

        System.out.println(result);
    }
}
