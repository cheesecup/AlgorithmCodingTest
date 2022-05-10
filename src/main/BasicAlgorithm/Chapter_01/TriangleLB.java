package BasicAlgorithm.Chapter_01;

import java.util.Scanner;

public class TriangleLB {
    public void method1() {
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
        System.out.print("몇 단 삼각형입니까?: ");
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();

        for (int i = 1; i < dan + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
