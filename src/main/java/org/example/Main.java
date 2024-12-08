package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing BinaryHeap:");
        BinaryHeap heap = new BinaryHeap();
        heap.insert(5, "A");
        heap.insert(10, "B");
        heap.insert(3, "C");
        System.out.println(heap.extractMax()); // Should print "B"
        System.out.println(heap.extractMax()); // Should print "A"
        System.out.println(heap.extractMax()); // Should print "C"

        System.out.println("\nTesting LazyPriorityQueue:");
        LazyPriorityQueue lazyQueue = new LazyPriorityQueue();
        lazyQueue.insert(5, "A");
        lazyQueue.insert(10, "B");
        lazyQueue.insert(3, "C");
        System.out.println(lazyQueue.extractMax()); // Should print "B"
        System.out.println(lazyQueue.extractMax()); // Should print "A"
        System.out.println(lazyQueue.extractMax()); // Should print "C"
    }
}
