package javaStudy0317;

public class Array4 {

    public static void main(String[] args) {

        // arr 배열의 인덱스가 3인 곳을 제외하여 출력
        int[] arr = {1, 2, 3, 4, 5};

        for(int i = 0; i < arr.length; i++) {
            if (i == 3) continue;
            System.out.println("arr [" + i + "] :" + arr[i]);
        }
    }
}
