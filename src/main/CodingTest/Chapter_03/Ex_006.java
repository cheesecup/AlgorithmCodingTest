package CodingTest.Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 투 포인터 */
public class Ex_006 {
    public void P2018() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int[] S = new int[N+1];
        S[0] = 0;
        for (int i=1; i<=N; i++) {
            S[i] = i + S[i-1];
        }
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                if (S[j] - S[i-1] == N) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public void P2018SOl() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        int cnt = 1;
        int sum = 1;
        int start_index = 1;
        int end_index = 1;

        while (end_index != N) {
            if (sum > N) {
                sum = sum - start_index;
                start_index++;
            } else if (sum < N) {
                end_index++;
                sum = sum + end_index;
            } else {
                cnt++;
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(cnt);
    }
}
