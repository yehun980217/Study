import java.util.Scanner;

public class ScanGugudan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력을 원하는 단을 숫자만 입력해주세요. Ex) 5단을 원하시면 5");

        int userInput = sc.nextInt();

        System.out.println(userInput + "단");
        for (int i = 1; i < 10; i++) {
            System.out.println(userInput + " X " + i + " = " + (userInput * i));
        }
        sc.close();
    }
}
