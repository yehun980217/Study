package javaStudy0317;

public class Array3 {
    
    public static void main(String[] args) {
        
        // arr 배열 안의 모든 값을 더하고, 총합과 평균을 출력
        int[] arr = {10, 20, 4, 7, 50, 15, 17};
        int sum = 0;
        double avg = 0.0;

        for (int i : arr) {
            sum += i;
        }

        avg = (double) sum / arr.length;
        System.out.println("총합 : " + sum +"\n" + "평균 : " + avg);

    }
}
