package CodingTest.Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex_007 {
    public void P1940() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()); // 재료의 개수 N
        st = new StringTokenizer(bf.readLine());
        int M = Integer.parseInt(st.nextToken()); // 고유값 M

        int[] arr = new int[N];
        st = new StringTokenizer(bf.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int cnt = 0;
        int start_index = 0;
        int end_index = N-1;

        while (start_index < end_index) {
            if (arr[start_index] + arr[end_index] > M) {
                end_index--;
            } else if (arr[start_index] + arr[end_index] < M) {
                start_index++;
            } else {
                cnt++;
                start_index++;
                end_index--;
            }
        }
        System.out.println(cnt);
        bf.close();
    }
}
