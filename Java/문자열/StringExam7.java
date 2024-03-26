public class StringExam7 {
    public static void main(String[] args) {
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 \"http://www.example.com/start.html\" \"Mozilla/4.08 [en] (Win98; I ;Nav)\"";
        int logLen = log.length();
        System.out.println(logLen);

        // http://www.example.com/start.html 출력
        int sub1 = log.indexOf("http");
        int sub2 = log.indexOf("\"", sub1);
        System.out.println(log.substring(sub1, sub2));

        // Mozilla/4.08 [en] (Win98; I ;Nav) 출력
        int sub3 = log.lastIndexOf("\"");
        int sub4 = log.lastIndexOf("\"", sub3 - 1);
        System.out.println(sub3);
        System.out.println(sub4);
        System.out.println(log.substring(sub4 + 1, sub3));

        // log 대문자 변환
        System.out.println(log.toUpperCase());
        // log 소문자 변환
        System.out.println(log.toLowerCase());

        // 문자열 앞, 뒤 공백 제거
        String strEx = "   Trim   연습   ";
        System.out.println("[" + strEx.trim() + "]");
        // 문자열 전체 공백 제거
        System.out.println("[" + strEx.replaceAll(" ", "") + "]");
    }
}
