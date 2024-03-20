public class ForBasic {

    public static void main(String[] args) { // for문 기본
        int i;

        for(i = 1; i < 6; i++) {
            System.out.println(i); // ln은 줄바꿈이기에 출력 시 1 \n 2 \n 3 \n 4 ...식으로 출력됨
        }
        for(i = 1; i < 6; i++) { // 출력값 : 12345
            System.out.print(i);
        }
    }
}
