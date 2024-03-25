public class StringExam4 {

    public static void main(String[] args) {
        String str = "    한글    ABCD    reas     ";
        String cutStr = "";
        String upper = "";
        String lower = "";
        String allCutStr = "";

        cutStr = str.trim();
        upper = str.toUpperCase();
        lower = str.toLowerCase();
        allCutStr = str.replaceAll(" " , ""); // regex" " 공백이 있는 것을 -> raplacement"" 공백 제거

        System.out.println("[" + str + "]"); // 기본 문자열 [    한글    ABCD    reas     ]
        System.out.println("[" + cutStr + "]"); // 공백 제거 [한글    ABCD    reas]
        System.out.println(upper); // 소문자 -> 대문자     한글    ABCD    REAS
        System.out.println(lower); // 대문자 -> 소문자     한글    abcd    reas
        System.out.println(allCutStr); // 문자열 전체 공백 제거 한글ABCDreas
    }
}
