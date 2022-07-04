package CodingTest.Chapter_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 슬라이딩 윈도우 - DNA 비밀번호*/
public class Ex_009 {
    public void P12891() throws IOException {
        // {‘A’, ‘C’, ‘G’, ‘T’} == {65, 67, 71, 84}
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken()); // DNA 문자열 길이 S
        int P = Integer.parseInt(st.nextToken()); // 부분 문자열 길이 P

        st = new StringTokenizer(bf.readLine());
        String dna = st.nextToken();
        int[] arr = dnaSub(dna, S);
        System.out.println(Arrays.toString(arr));

        int[] checkArr = new int[4];
        st = new StringTokenizer(bf.readLine());
        for (int i=0; i<4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
        }



    }

    // 입력 문자열 추출
    public static int[] dnaSub(String dna, int len) {
        int[] arr = new int[26];
        for (int i=0; i<len; i++) {
            int res = dna.charAt(i) - 65;
            arr[res]++;
        }
        return arr;
    }

    // 부분 문자열 추출

    //
}
