package javaStudy0317;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Array6 {

    public static void main(String[] args) {

        // 2개의 인덱스 값을 받아 그 값을 서로 교환하여 출력
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("초기 배열은 " + Arrays.toString(arr) + " 입니다.");
        System.out.println("서로 변경할 첫번째 인덱스 값을 입력하세요.");
        int change1 = sc.nextInt();
        System.out.println("서로 변경할 두번째 인덱스 값을 입력하세요.");
        int change2 = sc.nextInt();

        int temp = arr[change1];
        arr[change1] = arr[change2];
        arr[change2] = temp;

        System.out.println("변경된 배열은 " + Arrays.toString(arr) + " 입니다.");
    }
    
    public static void exam(String[] args) { // 다른 방법

        int[] arr = { 10, 20, 30, 50, 3, 60, -3 };

        int choice1 = Integer.parseInt(JOptionPane.showInputDialog("바꾸고 싶은 인덱스 번호1을 입력하세여."));
        int choice2 = Integer.parseInt(JOptionPane.showInputDialog("바꾸고 싶은 인덱스 번호2을 입력하세여."));

        int temp = arr[choice1];
        arr[choice1] = arr[choice2];
        arr[choice2] = temp;

        String msg = "";
        for (int i = 0; i < arr.length; i++) {
            msg += arr[i] + " ";
        }

        JOptionPane.showMessageDialog(null, msg);

    }
}
