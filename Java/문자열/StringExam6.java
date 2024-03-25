public class StringExam6 {

    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str.substring(0,1)); // 인덱스 0부터 1까지

        String str1 = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 \"http://www.example.com/start.html\" \"Mozilla/4.08 [en] (Win98; I ;Nav)\"";
        // 벙슨코드
        System.out.println(str1.indexOf("1",1)); // 벙슨짓
        System.out.println(str1.substring(0,9)); // 벙슨짓

        System.out.println(str1.substring(0, str1.indexOf(" "))); // 아이피가 변경되어도 아이피만 잘라오기 때문에 IP 분석 시 이게 맞음

        // 방식이 변해도 받아올 수 있지만 코드가 너무 길어서 가독성 저하됨
        System.out.println(str1.substring(str1.indexOf("\"")+1, str1.indexOf("/", str1.indexOf("\""))-1));
        // 변수를 사용안하면 코드의 가독성이 떨어지기 때문에 변수에 할당하는 것도 하나의 방법
        int index1 = str1.indexOf("\"");
        int index2 = str1.indexOf(" ", index1);
        System.out.println(str1.substring(index1+1, index2)); 
    }
}
