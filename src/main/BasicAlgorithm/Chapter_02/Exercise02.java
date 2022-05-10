package BasicAlgorithm.Chapter_02;

import java.util.Arrays;
import java.util.Random;

public class Exercise02 {

    public int countPeople() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public void copy(int[] a, int[] b) {
        b = a.clone();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public void reverseCopy(int[] a, int[] b) {
        b = a.clone();
        ReverseArray reverseArray = new ReverseArray();
        for (int i = 0; i < b.length / 2; i++) {
            reverseArray.swap(b, i);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
