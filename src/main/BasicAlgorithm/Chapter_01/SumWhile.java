package BasicAlgorithm.Chapter_01;

public class SumWhile {
    public int sumOutput(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}
