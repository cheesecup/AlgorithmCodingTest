package CodingTest.Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_005 {
    public void P10986() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()); // 입력할 수의 개수 N
        int M = Integer.parseInt(st.nextToken()); // 나눌 수 M

        // 합 배열 생성
        int[] S = new int[N+1];
        st = new StringTokenizer(bf.readLine());
        for (int i=1; i<N+1; i++) {
            S[i] = Integer.parseInt(st.nextToken()) + S[i-1];
        }

        // 합 배열 요소 M으로 나누기
        long[] remainderCnt = new long[M]; // 나머지가 동일한 수 카운트를 담는 배열
        for (int i=1; i<N+1; i++) {
            remainderCnt[S[i] % M]++;
        }

        long answer = remainderCnt[0]; // 나머지가 0인 개수로 초기화
        for (int i=0; i<remainderCnt.length; i++) {
            if (remainderCnt[i] > 1) {
                answer += remainderCnt[i] * (remainderCnt[i] - 1) / 2;
            }
        }
        System.out.println(answer);
    }
}
