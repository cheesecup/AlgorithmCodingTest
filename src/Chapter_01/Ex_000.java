package Chapter_01;

public class Ex_000 {
    public void timeComplexityExample1() {
        /* 1 ~ 100 사이 값 랜덤 선택 */
        int findNumber = (int) (Math.random() * 100);

        for(int i = 0; i < 100; i++) {
            if(i == findNumber) {
                System.out.println(i);
                break;
            }
        }
    }
}
