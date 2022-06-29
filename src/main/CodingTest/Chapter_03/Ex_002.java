package CodingTest.Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 평균 구하기 */
public class Ex_002 {
    public void P1546() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0 ; i < N; i++) {
            arr[i] =  Integer.parseInt(st.nextToken());
        }

        long M = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( M < arr[i]) {
                M = arr[i];
            }
            sum = sum + arr[i];
        }
        System.out.println(sum * 100.0 / M / N);
    }
}
