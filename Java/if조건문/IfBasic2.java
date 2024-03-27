public class IfBasic2 {

    public static void main(String[] args) {

        int num = 6;

        if (num % 2 == 0) {
            System.out.println("num은 2의 배수"); // 참, 실행 O
            if (num % 3 == 0) {
                System.out.println("num은 3의 배수"); // 참, 실행 O
            }
            if (num % 4 == 0) {
                System.out.println("num은 4의 배수"); // 거짓, 실행 X
            }
        }
    }
}
