package CodingTest.Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 슬라이딩 윈도우 - DNA 비밀번호*/
public class Ex_009 {
    static int[] myArr;
    static int[] checkArr; // 비밀번호 체크 배열
    static int checkSecret;

    public void P12891() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int Result = 0;
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;
        int S = Integer.parseInt(st.nextToken()); // 문자열 크기 S
        int P = Integer.parseInt(st.nextToken()); // 부분 문자열 크기 P

        char[] A = new char[S]; // 문자열 데이터
        st = new StringTokenizer(bf.readLine());
//        A = st.nextToken().toCharArray();
        String inputDNA = st.nextToken();
        for (int i=0; i<S; i++) {
            A[i] = inputDNA.charAt(i);
        }
        System.out.println("A[]=" + Arrays.toString(A));

        /* {‘A’, ‘C’, ‘G’, ‘T’} */
        st = new StringTokenizer(bf.readLine());
        for (int i=0; i<4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++;
            }
        }
        System.out.println("checkArr[]=" + Arrays.toString(checkArr));

        for (int i=0; i<P; i++) {
            add(A[i]);
        }
        if (checkSecret == 4) {
            Result++;
        }

        // 슬라이딩 윈도우 처리
        for (int i=P; i<S; i++) {
            int j = i - P;
            add(A[i]);
            remove(A[j]);
            if (checkSecret == 4) {
                Result++;
            }
        }
        System.out.println(Result);
        bf.close();
    }

    // 문자 더하기 함수
    private static void add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) {
                    checkSecret++;
                }
                break;

            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) {
                    checkSecret++;
                }
                break;

            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) {
                    checkSecret++;
                }
                break;

            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) {
                    checkSecret++;
                }
                break;
        }
    }

    // 문자 빼기 함수
    public static void remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) {
                    checkSecret--;
                }
                myArr[0]--;
                break;

            case 'C':
                if (myArr[1] == checkArr[1]) {
                    checkSecret--;
                }
                myArr[1]--;
                break;

            case 'G':
                if (myArr[2] == checkArr[2]) {
                    checkSecret--;
                }
                myArr[2]--;
                break;

            case 'T':
                if (myArr[3] == checkArr[3]) {
                    checkSecret--;
                }
                myArr[3]--;
                break;
        }
    }
}
