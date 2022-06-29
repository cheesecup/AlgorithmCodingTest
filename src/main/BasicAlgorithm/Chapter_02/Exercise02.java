package BasicAlgorithm.Chapter_02;

import java.util.Arrays;
import java.util.Random;

public class Exercise02 {
    int[][] mDays = {
            {31,28,31,30,31,30,31,31,30,31,30,31}, // 평년
            {31,29,31,30,31,30,31,31,30,31,30,31}, // 윤년
    };

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

    public int isLeap(int year) {
        /* 윤년 = 1
         *  평년 = 0 */
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    public int dayOfYear(int y, int m , int d) {
        int days = d;
        for (int i = 0; i < m - 1; i++) {
            days = days + mDays[isLeap(y)][i];
        }
        return days;
    }

    public int leftDayOfYear(int y, int m , int d) {
        return 365 + isLeap(y) - dayOfYear(y,m,d);
    }

}
