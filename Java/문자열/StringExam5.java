public class StringExam5 {

    public static void main(String[] args) {
        String str ="난생처음 자바를 처음 학습 중입니다. 자바는 처음이지만 재미있네요.";

        System.out.println(str.indexOf("처음")); // 2
        System.out.println(str.lastIndexOf("처음")); // <- 방향에서 첫번째 처음 25
        System.out.println(str.indexOf("처음" , 4)); // 인덱스 4번부터 시작해서 첫번째 처음 9
    }
}
