package BasicAlgorithm.Chapter_02;

public class ReverseArray {
    static void swap(int[] x, int i) {
            int space = x[i];
            x[i] = x[x.length - (i + 1)];
            x[x.length - (i + 1)] = space;

    }

    public void revArray(int[] x) {
        System.out.println("요소를 역순으로 정렬했습니다.");

        for (int i = 0; i < x.length / 2; i++) {
            swap(x, i);
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]= " + x[i]);
        }

    }
}
