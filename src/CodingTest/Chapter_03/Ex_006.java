package CodingTest.Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_006 {

    /* 연속된 자연수의 합 구하기 */
    public void P2018() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken()); // 입력받은 정수 N
        int sum = 1; int cnt = 1; int startIndex = 1; int endIndex = 1;

        while (endIndex != N) {
            if (sum == N) {
                cnt++;
                endIndex++;
                sum = sum + endIndex;
            } else if (sum > N) {
                sum = sum - startIndex;
                startIndex++;
            } else if (sum < N) {
                endIndex++;
                sum = sum + endIndex;
            }
        }
        System.out.println(cnt);
    }
}
