package CodingTest.Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 좋은 수 구하기 */
public class Ex_008 {
    public void P1253() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()); // N개의 수

        long[] arr = new long[N];
        st = new StringTokenizer(bf.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int cnt = 0;
        for (int i=0; i<N; i++) {
            long M = arr[i];
            int start_index = 0;
            int end_index = N-1;

            while (start_index < end_index) {
                if (M == arr[start_index] + arr[end_index]) {
                    if (start_index != i && end_index != i) {
                        cnt++;
                        break;
                    } else if (start_index == i) {
                        start_index++;
                    } else {
                        end_index--;
                    }
                } else if (M < arr[start_index] + arr[end_index]) {
                    end_index--;
                } else {
                    start_index++;
                }
            }
        }
        System.out.println(cnt);
        bf.close();
    }
}
