package CodingTest.Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex_005 {

    /* 나머지 합 구하기 */
    public void P10986() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken()); // 입력한 배열의 길이
        int M = Integer.parseInt(stringTokenizer.nextToken()); // 나누어 떨어져야 하는 수
        System.out.println("N=" + N + "M=" + M);

        int[] S = new int[N+1];

        /* 합 배열 S[] 생성 */
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= N; i++) {
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println("합 배열 S[]=" + Arrays.toString(S));

        int zeroCnt = 0;
        for (int i = 1; i<= N; i++) {
            int remainder = S[i] % M; // 합 배열의 각 원소를 M으로 나눈 나머지
            if (remainder == 0) { zeroCnt++; } // 0 의 개수 카운트
            S[i] = remainder;
        }
        System.out.println("나머지로 이루어진 합 배열 S[]=" + Arrays.toString(S));
        System.out.println("0 개수=" + zeroCnt);

        int sameNumCnt = 0;
        for (int i = 1; i <= N; i++) {
                for (int j = i+1; j <= N; j++) {
                    if (S[i] == S[j]) { sameNumCnt++; }
            }
        }
        System.out.println(sameNumCnt);
        System.out.println(zeroCnt + sameNumCnt);
    }
}
