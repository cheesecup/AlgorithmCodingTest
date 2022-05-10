import BasicAlgorithm.Chapter_02.Exercise02;
import BasicAlgorithm.Chapter_02.MaxOfArray;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercise02 exercise = new Exercise02();
        System.out.println("키의 최대값을 구합니다.");
        Scanner sc = new Scanner(System.in);
        System.out.print("사람수: ");
        int peopleCnt = exercise.countPeople();
        System.out.println(peopleCnt);

        int[] a = new int[peopleCnt];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            System.out.print("height[" + i + "]: ");
            a[i] = 100 + random.nextInt(90);
            System.out.println(a[i]);
        }

        MaxOfArray maxOfArray = new MaxOfArray();
        maxOfArray.maxOf(a);

    }
}
