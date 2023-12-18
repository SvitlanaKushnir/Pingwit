package pl.pingwit.lesson20.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BenchmarkMiddleDeleter {
    public static void main(String[] args) {

        int size = 100000;
        List<Integer> arrayList = new ArrayList<>();
        createList(arrayList, size);
        long startTime = System.currentTimeMillis();
        deleteFromMiddle(arrayList);
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList: " + (endTime - startTime));

        List<Integer> linkedList = new LinkedList<>();
        createList(linkedList, size);
        startTime = System.currentTimeMillis();
        deleteFromMiddle(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList: " + (endTime - startTime));
    }

    private static void createList(List<Integer> list, int size) {
        for (int i = 0; i <= size; i++) {
            list.add(i);
        }
    }

    private static void deleteFromMiddle(List<Integer> list) {
        for (int i = list.size() / 2; i <= list.size(); i++)
            list.remove(i);
    }
}