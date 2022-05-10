package main.CodingTest.Chapter_03;

import java.util.Scanner;

public class Ex_002 {

    /* 평균 구하기 */
    public void P1546() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        /* 1차원 배열 arr[]에 입력한 점수 저장 */
        for (int i = 0; i < arr.length; i++) {
//            String score = sc.next();
//            arr[i] = Integer.parseInt(score);
            arr[i] = sc.nextInt();
        }

        /* 최대값과 총합 점수 구하기 */
        long max = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
//            max = arr[i];
            if (arr[i] > max) { max = arr[i]; }
            sum = sum + arr[i]; // 총합 점수
        }

        /* 출력값 */
        System.out.println(sum * 100.0 / max / N);
    }
}
