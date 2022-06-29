package CodingTest.Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 구간 합 구하기 */
public class Ex_003 {
    public void P11659() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수의 개수
        int M = sc.nextInt(); // 합을 구해야 하는 횟수

        int[] arr = new int[N + 1]; // N개의 수가 저장

        // N개의 수 배열에 저장
        for (int i=1; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 합 배열 구하기
        int[] sumArr = new int[N+1]; // 합배열을 저장
        for (int i=1; i<sumArr.length; i++) {
                sumArr[i] = sumArr[i-1] + arr[i];
        }

        // 구간 합 구하기
        int start;
        int end;
        int[] resultArr = new int[M]; // 결과를 저장
        for (int i=0; i<M; i++) {
            start = sc.nextInt();
            end = sc.nextInt();
            resultArr[i] = sumArr[end] - sumArr[start - 1];
        }

        // 출력
        for (int i=0; i<resultArr.length; i++) {
            System.out.println(resultArr[i]);
        }
    }

    public void ex003_Solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        long[] S = new long[N+1]; // 합 배열 초기화
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        // 합 배열에 값 저장
        for (int i=1; i<S.length; i++) {
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int k=0; k < M; k++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i -1]);
        }
    }
}
