package main.CodingTest.Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex_008 {

    /* 입력 값 int 타입으로 변환 */
    public int input(String str) {
        return Integer.parseInt(str);
    }

    /* '좋은 수' 구하기 */
    public void P1253() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = input(stringTokenizer.nextToken()); // 배열에 들어가는 데이터 개수

        /* 배열 A 생성 */
        int[] A = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = input(stringTokenizer.nextToken());
        }
        Arrays.sort(A); // 배열 오름차순으로 정렬

        /* count 계산 */
        int count = 0;
        for (int z = 0; z < N; z++) {
            int i = 0;
            int j = N - 1;
            int K = A[z];

            while (i < j) {
                if (A[i] + A[j] == K) {
                    if (i != z && j != z) {
                        count++;
                        break;
                    } else if (i == z) {
                        i++;
                    } else if (j == z) {
                        j--;
                    }
                } else if (A[i] + A[j] < K) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        System.out.println(count);
        bufferedReader.close();
    }
}
