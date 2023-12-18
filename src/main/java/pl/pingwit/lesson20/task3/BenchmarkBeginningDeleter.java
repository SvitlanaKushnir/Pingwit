package pl.pingwit.lesson20.task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BenchmarkBeginningDeleter {
    public static void main(String[] args) {
        int size = 100000;
        List<Integer> arrayList = new ArrayList<>();
        createList(arrayList, size);
        long startTime = System.currentTimeMillis();
        deleteFromBeginning(arrayList);
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList: " + (endTime - startTime));

        List<Integer> linkedList = new LinkedList<>();
        createList(linkedList, size);
        startTime = System.currentTimeMillis();
        deleteFromBeginning(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList: " + (endTime - startTime));
    }

    private static void createList(List<Integer> list, int size) {
        for (int i = 0; i <= size; i++) {
            list.add(i);
        }
    }

    private static void deleteFromBeginning(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }
}