package CodingTest.Chapter_03;

import java.util.Scanner;

/* 숫자의 합 구하기 */
public class Ex_001 {
    public void P11720() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 숫자의 개수

        String number = sc.next();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + Integer.parseInt(number.substring(i,i+1));
        }
        System.out.println(sum);
    }

    public void doIt001() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 숫자의 개수

        // 입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환하기
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i=0; i<cNum.length; i++) {
            sum += cNum[i] - '0'; // cNum[i]를 정수형으로 변환하면서 sum에 더하여 누적하기
        }
        System.out.print(sum);
    }
}
