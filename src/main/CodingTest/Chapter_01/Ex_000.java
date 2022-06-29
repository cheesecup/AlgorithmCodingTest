package CodingTest.Chapter_01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_000 {
    public void P2750() {
        /* N개의 수가 주어졌을 때 이를 오름차순 정렬하는 프로그램을 작성하시오. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
