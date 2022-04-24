package Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ex_007 {

    /* 주몽의 명령 */
    public void P1940() throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력받을 개수
        int M = sc.nextInt(); // 값옷이 되는 값
        System.out.println("N=" + N + " M=" + M);

        int count = 0;

        /* 배열 A[]에 입력 받은 값들 저장 */
        int[] A = new int[N];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println("정렬 전 배열A=" + Arrays.toString(A));

        Arrays.sort(A); // 배열 A 오름차순으로 정렬
        System.out.println("정렬 후 배열A=" + Arrays.toString(A));

        /* count 구하기 */
        int i = 0;
        int j = N - 1;
        while (i < j) {
            if (A[i] + A[j] > M) {
                j--;
            } else if (A[i] + A[j] < M) {
                i++;
            } else if (A[i] + A[j] == M) {
                i++;
                j--;
                count++;
            }
        }
        System.out.println(count);
        bufferedReader.close();
    }
}
