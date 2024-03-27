public class IfBasic {

    public static void main(String[] args) {
        if (true) {
            System.out.println("실행 1"); // 실행
        }

        if (false) {
            System.out.println("실행 2");
            System.out.println("실행 3");
        }

        if (3 != 3)
            System.out.println("실행 4"); // 중괄호가 없으면 다음 하나의 문장만 if문으로 인식
            System.out.println("실행 5"); // 실행
    }
}
