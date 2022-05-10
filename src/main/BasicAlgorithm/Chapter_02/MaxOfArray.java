package BasicAlgorithm.Chapter_02;

public class MaxOfArray {
    public void maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) max = a[i];
        }
        System.out.println("최대값은 " + max + "입니다.");
    }
}
