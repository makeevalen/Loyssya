package loyssya.labs.lab4Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatrixStream {
    private int lengthList;
    private int widthLists;
    private List<List<Integer>> lists = new ArrayList();

    public void setLength(int lengthList) {
        this.lengthList = lengthList;
    }

    public int getLength() {
        return lengthList;
    }

    public void setWidth(int widthList) {
        this.widthLists = widthList;
    }

    public int getWidth() {
        return widthLists;
    }

    public List<List<Integer>> getRandomLists() {
        Random rand = new Random();

        for (int i = 0; i < lengthList; i++) {
            List<Integer> insideList = new ArrayList();
            for (int j = 0; j < widthLists; j++) {
                insideList.add(rand.nextInt(100) - 50);
            }
            lists.add(insideList);
        }

        return lists;
    }

    public void printList() {
        lists.forEach(System.out::println);
    }
}

