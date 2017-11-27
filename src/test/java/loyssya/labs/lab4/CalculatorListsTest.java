package loyssya.labs.lab4;

import static org.junit.Assert.*;

public class CalculatorListsTest {
    @org.junit.Test
    public void getMaximum() throws Exception {
        MatrixLists matrixLists = new MatrixLists();
        CalculatorLists calculatorLists =new CalculatorLists();

        matrixLists.setLength(7);
        matrixLists.setWidth(7);
        matrixLists.getRandomLists();
        matrixLists.printList();

        assertNotSame(calculatorLists.getMaximum(matrixLists), calculatorLists.getMinimum(matrixLists));

    }

    @org.junit.Test
    public void getMinimum() throws Exception {
       MatrixLists matrixLists = new MatrixLists();
        CalculatorLists calculatorLists =new CalculatorLists();

        matrixLists.setLength(7);
        matrixLists.setWidth(7);
        matrixLists.getRandomLists();
        matrixLists.printList();

        assertNotSame(calculatorLists.getMaximum(matrixLists), calculatorLists.getMinimum(matrixLists));

    }

}