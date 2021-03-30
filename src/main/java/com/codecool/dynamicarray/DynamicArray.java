package com.codecool.dynamicarray;

public class DynamicArray {
    private int[] array;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[this.capacity];
    }

    public DynamicArray() {
        this.capacity = 4;
        this.array = new int[this.capacity];
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int size() {
        return 0;
    }

    public void add(int value) {
    }

    public int get(int index) {
        return 0;
    }

    public void remove(int indexToBeRemoved) {
    }

    public void insert(int index, int newValue) {
    }
}
