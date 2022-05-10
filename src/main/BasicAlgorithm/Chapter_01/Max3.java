package BasicAlgorithm.Chapter_01;

public class Max3 {
    public int Max(int a, int b, int c) {
        int max = a;

        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }
}
