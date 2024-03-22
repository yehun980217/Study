package javaStudy0317;

public class Array2 {

    public static void main(String[] args) {

        // arr 배열 중에서 값이 40인 곳의 인덱스 출력
        int[] arr = {10, 20, 30, 40, 50};

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 40) {
                System.out.println("인덱스 값이 " + arr[i] + "인 곳은 " + i + "입니다" );
            }
        }

    }
}
