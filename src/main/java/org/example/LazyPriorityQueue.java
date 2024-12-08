package org.example;

import java.util.ArrayList;

public class LazyPriorityQueue {
    private ArrayList<Element> array;

    public LazyPriorityQueue() {
        array = new ArrayList<>();
    }

    public void insert(int priority, String value) {
        array.add(new Element(priority, value));
    }

    public String extractMax() {
        if (array.isEmpty()) {
            return null;
        }
        int maxIndex = 0;
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i).getPriority() > array.get(maxIndex).getPriority()) {
                maxIndex = i;
            }
        }
        return array.remove(maxIndex).getValue();
    }
}
