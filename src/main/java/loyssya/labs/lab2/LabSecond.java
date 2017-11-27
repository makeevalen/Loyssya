package loyssya.labs.lab2;

import java.util.ArrayList;
import java.util.Random;

public class LabSecond {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] mas = new int[1000][1000];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mas[i][j] = rand.nextInt(20) - 10;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(mas[i][j] + "  ");
            }

                System.out.println();

        }

        int max = getMaximum(mas);
        int min = getMinimum(mas);

        System.out.println();
        System.out.println("Maxmimum: " + max);
        System.out.println("Minimum: " + min);
    }

    static int getMaximum(int[][] getMas) {
        int max = getMas[0][0];
        for (int i = 0; i < getMas.length; i++) {
            for (int j = 0; j < getMas.length; j++)
                if (max < getMas[i][j])
                    max = getMas[i][j];
        }
        return max;
    }

    static int getMinimum(int[][] gMas) {
        int min = gMas[0][0];
        for (int i = 0; i < gMas.length; i++) {
            for (int j = 0; j < gMas.length; j++)
                if (min > gMas[i][j])
                    min = gMas[i][j];
        }
        return min;
    }
}

