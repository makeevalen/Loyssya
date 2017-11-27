package loyssya.labs.lab4;

public class LabList {
    public static void main(String[] args) {
        MatrixLists matrixLists = new MatrixLists();
        CalculatorLists calculatorLists =new CalculatorLists();


        matrixLists.setLength(7);
        matrixLists.setWidth(7);
        matrixLists.getRandomLists();
        matrixLists.printList();
        calculatorLists.getMaximum(matrixLists);
        calculatorLists.getMinimum(matrixLists);
    }
}
