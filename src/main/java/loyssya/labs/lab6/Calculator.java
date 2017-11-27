package loyssya.labs.lab6;

public class Calculator {
    private int lengthMatrix;
    private int widthMatrix;

    public void setWidth(Matrix matrix) {
        this.widthMatrix = matrix.getWidth();
    }

    public void setLength(Matrix matrix) {
        this.lengthMatrix = matrix.getLength();
    }

    public int getMaximum(Matrix matrix) {
        lengthMatrix = matrix.getLength();
        Integer max;
        for (int i = 1; i < lengthMatrix; i++) {
            matrix.getRandomMatrix().get(0).addAll(matrix.getRandomMatrix().get(i));
        }
        max = matrix.getRandomMatrix().get(0).stream().max(Integer::compareTo).get();
        System.out.println("Max: " + max);
        return max;
    }

    public int getMinimum(Matrix matrix) {
        lengthMatrix =matrix.getLength();
        Integer min;
        for (int i = 1; i < lengthMatrix; i++){
            matrix.getRandomMatrix().get(0).addAll(matrix.getRandomMatrix().get(i));
        }
        min = matrix.getRandomMatrix().get(0).stream().min(Integer::compareTo).get();
        System.out.println("Min: " + min);
        return min;
    }
}
