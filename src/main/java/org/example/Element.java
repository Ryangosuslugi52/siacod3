package org.example;

public class Element {
    private int priority;
    private String value;

    public Element(int priority, String value) {
        this.priority = priority;
        this.value = value;
    }

    public int getPriority() {
        return priority;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Element{" +
                "priority=" + priority +
                ", value='" + value + '\'' +
                '}';
    }
}
