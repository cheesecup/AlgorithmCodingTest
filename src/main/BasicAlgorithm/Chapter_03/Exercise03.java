package BasicAlgorithm.Chapter_03;

public class Exercise03 {
    public int searchIdx(int[] x, int n, int key) {
        int cnt = 0;
        int j = 0;
        int[] idx = new int[n];
        for (int i = 0; i < n; i++) {
            if (x[i] == key) {
                idx[j] = i;
                j++;
                cnt++;
            }
        }

        return idx.length;
    }
}
