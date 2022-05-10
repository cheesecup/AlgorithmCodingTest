package BasicAlgorithm.Chapter_01;

import java.util.Scanner;

public class Exercise01 {

    public int max4(int a, int b, int c) {
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        return max;
    }

    public int min3(int a, int b, int c) {
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        return min;
    }

    public int min4(int a, int b, int c, int d) {
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;
        return min;
    }

    public int gauss(int n) {
        return (1 + n) * n / 2;
    }

    public int sumOf(int a, int b) {
        if (a > b) {
            return (a + b) * (a - b + 1) / 2;
        } else {
            return (a + b) * (b - a + 1) / 2;
        }
    }

    public int minusTwoNumbers(int a) {
        Scanner sc = new Scanner(System.in);
        int b;
        do {
            System.out.print("b의 값: ");
            b = sc.nextInt();
            if (b <= a) {
                System.out.println("a보다 큰 값을 입력하세요!");
            }
        } while (b <= a);

        return b - a;
    }

    public int lengthOutput(int a) {
        String res = String.valueOf(a);

        return res.length();
    }

    public void multiplicationTable(int a) {
        System.out.print("   | ");
        for (int i = 1; i < a + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---+-------------------");
        for (int i = 1; i < a + 1; i++) {
            System.out.print(" "+ i + " | ");
            for (int j = 1; j < a + 1; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public void sumTable(int a) {
        System.out.print("   | ");
        for (int i = 1; i < a + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---+-------------------");
        for (int i = 1; i < a + 1; i++) {
            System.out.print(" "+ i + " | ");
            for (int j = 1; j < a + 1; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }

    public void rectangle() {
        System.out.println("사각형을 출력합니다.");
        Scanner sc = new Scanner(System.in);
        System.out.print("단 수 : ");
        int dan = sc.nextInt();

        for (int i = 0; i < dan; i++) {
            for (int j = 0; j < dan; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
