import BasicAlgorithm.Chapter_02.ArrayEqual;
import BasicAlgorithm.Chapter_02.Exercise02;
import BasicAlgorithm.Chapter_02.ReverseArray;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercise02 exercise02 = new Exercise02();
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 a의 요소수: ");
        int numOfA = sc.nextInt();

        int[] a = new int[numOfA];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        int[] b = new int[a.length];
        exercise02.reverseCopy(a, b);

    }
}
