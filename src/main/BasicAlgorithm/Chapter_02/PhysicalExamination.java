package BasicAlgorithm.Chapter_02;

import java.util.Scanner;

public class PhysicalExamination {
    static final int VMAX = 21; // 시력 분포 (0.0에서 0.1 단위로 21개)

    static class PhyscData{
        String name;
        int height;
        double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    /* 키와 평균값을 구함 */
    static double aveHeight(PhyscData[] dat) {
        double sum = 0;
        for (int i = 0; i < dat.length; i++) {
            sum = sum + dat[i].height;
        }
        return sum / dat.length;
    }

    //    /* 시력 분포를 구함 */
//    static void distVision(PhyscData[] dat, int[] dist) {
//        double vision;
//        int k = 0;
//        dist[k] = 0;
//        for (int i = 0; i < dat.length; i++) {
//            vision = dat[i].vision;
//            for (int j = 0; j < VMAX; i++) {
//                double jDouble = (double) j;
//                if (vision == jDouble / 10) {
//                    dist[j] = dist[j] + 1;
//                }
//            }
//        }
//    }
    /* 시력 분포를 구함 */
    static void distVision(PhyscData[] dat, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
                dist[(int)(dat[i].vision * 10)]++;
            }
        }
    }

    public void physical() {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("박현규", 162, 0.1),
                new PhyscData("함진아", 173, 0.3),
                new PhyscData("최윤미", 175, 0.2),
                new PhyscData("횽연의", 171, 1.5),
                new PhyscData("이수진", 168, 0.2),
                new PhyscData("김영준", 174, 0.2),
                new PhyscData("박용규", 169, 0.8),
        };
        int[] vdist = new int[VMAX]; // 시력 분포

        System.out.println("■ 신체검사 리스트 ■");
        System.out.println("이름       키   시력");
        System.out.println("-------------------");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n",x[i].name,x[i].height,x[i].vision);
        }

        System.out.printf("\n평균 키: %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f ~: ", i / 10.0);
            for (int j = 0 ; j < vdist[i]; j++) {
                System.out.printf("%s", '*');
            }
            System.out.println();
        }
    }
}
