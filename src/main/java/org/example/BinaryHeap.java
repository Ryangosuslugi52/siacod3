package org.example;

import java.util.ArrayList;

public class BinaryHeap {
    private ArrayList<Element> heap;

    public BinaryHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int priority, String value) {
        heap.add(new Element(priority, value));
        siftUp(heap.size() - 1);
    }

    public String extractMax() {
        if (heap.isEmpty()) {
            return null;
        }
        swap(0, heap.size() - 1);
        Element max = heap.remove(heap.size() - 1);
        siftDown(0);
        return max.getValue();
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index).getPriority() > heap.get(parent).getPriority()) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    private void siftDown(int index) {
        int size = heap.size();
        while (2 * index + 1 < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (heap.get(left).getPriority() > heap.get(largest).getPriority()) {
                largest = left;
            }
            if (right < size && heap.get(right).getPriority() > heap.get(largest).getPriority()) {
                largest = right;
            }
            if (largest != index) {
                swap(index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        Element temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
