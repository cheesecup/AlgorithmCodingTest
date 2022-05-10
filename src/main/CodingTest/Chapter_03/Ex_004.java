package main.CodingTest.Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex_004 {

    /* 구간 합 구하기2 */
    public void P11660() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        long[][] A = new long[N+1][N+1]; // 2차원 배열 A 생성
        long[][] S = new long[N+1][N+1]; // 2차원 합 배열 S 생성

        /* 2차원 배열 A 생성 */
        for (int i = 1; i <= N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 1; j <= N; j++) {
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        System.out.println("2차원 배열 A[][]=" + Arrays.deepToString(A));

        /* 2차원 합 배열 S 생성 */
        for (int i = 1; i <= N; i++) {
            for (int j = 1 ; j <= N; j++) {
                S[i][j] = S[i][j-1] + S[i-1][j] - S[i-1][j-1] + A[i][j];
            }
        }
        System.out.println("2차원 합 배열 S[][]=" + Arrays.deepToString(S));

        long[] res = new long[M];
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int X1 = Integer.parseInt(stringTokenizer.nextToken());
            int Y1 = Integer.parseInt(stringTokenizer.nextToken());
            int X2 = Integer.parseInt(stringTokenizer.nextToken());
            int Y2 = Integer.parseInt(stringTokenizer.nextToken());

            res[i] = S[X2][Y2] - S[X1-1][Y2] - S[X2][Y1-1] + S[X1-1][Y1-1];
        }

        for (int i = 0; i < M; i++) {
            System.out.println(res[i]);
        }
    }
}
