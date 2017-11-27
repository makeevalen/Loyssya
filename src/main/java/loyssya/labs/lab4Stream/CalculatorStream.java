package loyssya.labs.lab4Stream;


public class CalculatorStream {
    private int lengthLists;

    public void setLength(MatrixStream matrix) {
        this.lengthLists = matrix.getLength();
    }

    public Integer getMaximum(MatrixStream matrix) {
        lengthLists =matrix.getLength();
        for (int i = 1; i < lengthLists; i++){
            matrix.getRandomLists().get(0).addAll(matrix.getRandomLists().get(i));
        }
        Integer max = matrix.getRandomLists().get(0).stream().max(Integer::compareTo).get();
        System.out.println("Max: " + max);
        return max;
    }

    public Integer getMinimum(MatrixStream matrix) {
        lengthLists =matrix.getLength();
        for (int i = 1; i < lengthLists; i++){
            matrix.getRandomLists().get(0).addAll(matrix.getRandomLists().get(i));
        }
        Integer min = matrix.getRandomLists().get(0).stream().min(Integer::compareTo).get();
        System.out.println("Min: " + min);
        return min;
    }
}