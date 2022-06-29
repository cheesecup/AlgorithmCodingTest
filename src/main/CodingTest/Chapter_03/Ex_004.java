package CodingTest.Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 구간 합 구하기2 */
public class Ex_004 {
    public void P11660() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken()); // 표의 크기
        int M = Integer.parseInt(st.nextToken()); // 합을 구해야 하는 횟수

        // 입력한 행렬 저장
        int[][] matrix = new int[N+1][N+1];
        for (int i=1; i<matrix.length; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j=1; j<matrix.length; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }
//        System.out.println();

        // 합 배열 행렬 저장
        int[][] S = new int[N+1][N+1];
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix.length; j++) {
                S[i][j] = S[i-1][j] + S[i][j-1] - S[i-1][j-1] + matrix[i][j];
            }
        }
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(S[i]));
//        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            System.out.println(S[x2][y2] - S[x1 - 1][y2] - S[x2][y1 - 1] + S[x1 - 1][y1 - 1]);
        }
    }
}
