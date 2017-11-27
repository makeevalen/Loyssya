package loyssya.labs.lab4;

import java.util.List;

public class CalculatorLists {
    private int lengthList;
    private int widthLists;

    public void setLength(MatrixLists matrixLists) {
        this.lengthList = matrixLists.getLength();
    }

    public void setWidth(MatrixLists matrixLists) {
        this.widthLists = matrixLists.getWidth();
    }

    public int getMaximum(MatrixLists matrixLists) {
        int max = matrixLists.getRandomLists().get(0).get(0);
        lengthList= matrixLists.getLength();
        widthLists = matrixLists.getWidth();
        for (List<Integer> lists : matrixLists.getRandomLists()) {
            for (Integer num : lists) {
                if (max < num)
                    max = num;
            }
        }
        System.out.println("Max: " + max);
        return max;
    }

    public int getMinimum(MatrixLists matrixLists) {
        int min = matrixLists.getRandomLists().get(0).get(0);
        lengthList= matrixLists.getLength();
        widthLists = matrixLists.getWidth();
        for (List<Integer> lists : matrixLists.getRandomLists()) {
            for (Integer num : lists) {
                if (min > num)
                    min = num;
            }
        }
        System.out.println("Min: " + min);
        return min;

    }
}
