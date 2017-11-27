package loyssya.labs.lab4Stream;

public class StreamList {
    public static void main(String[] args) {
        MatrixStream matrix = new MatrixStream();
        CalculatorStream calculatorStream =new CalculatorStream();

        matrix.setLength(7);
        matrix.setWidth(7);
        matrix.getRandomLists();
        matrix.printList();
        calculatorStream.getMaximum(matrix);
        calculatorStream.getMinimum(matrix);
    }
}
