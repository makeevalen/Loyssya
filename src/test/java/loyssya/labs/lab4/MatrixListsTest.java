package loyssya.labs.lab4;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatrixListsTest {
    @Test
    public void getRandomLists() throws Exception {
        MatrixLists matrixLists = new MatrixLists();
        List<List<Integer>> matrix = null;

        matrixLists.setLength(7);
        matrixLists.setWidth(7);
        matrix = matrixLists.getRandomLists();

        assertNotNull(matrix);

        matrixLists.printList();
    }
}