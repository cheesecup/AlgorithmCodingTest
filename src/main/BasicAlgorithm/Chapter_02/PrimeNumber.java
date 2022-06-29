package BasicAlgorithm.Chapter_02;

public class PrimeNumber {
    /* 1000이하의 소수 열거 */
    public void primeNum() {
        for (int i = 2; i <= 1000; i++) {
            int j;
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(i);
            }
        }
    }
}
