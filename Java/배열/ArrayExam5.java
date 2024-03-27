package javaStudy0317;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Array5 {

    // arr 배열 중 사용자가 변경하고 싶은 인덱스의 값과 배열 값을 변경하여 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("현재 배열은 " + Arrays.toString(arr) + "입니다.");
        System.out.println("변경을 원하시는 인덱스 값을 입력하세요.");
        int index = sc.nextInt();
        System.out.println("변경을 원하시는 배열 값을 입력하세요.");
        int arrVal = sc.nextInt();
        
        arr[index] = arrVal;

        System.out.println("변경된 배열은 " + Arrays.toString(arr) + "입니다.");

        // 다른 방법
        int[] aa = { 10, 20, 30, 50, 3, 60, -3 };

        int choice = Integer.parseInt(JOptionPane.showInputDialog("바꾸고 싶은 배열의 인덱스 번호를 입력하세요.")); // 외부에 입력창이 나타남
        aa[choice] = 1000;

        String msg = "";
        for (int i=0; i<arr.length; i++) {
            msg += aa[i] + " ";
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}
