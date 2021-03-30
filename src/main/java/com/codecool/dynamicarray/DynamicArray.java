package com.codecool.dynamicarray;

import java.util.Arrays;

public class DynamicArray {
    private int[] array;
    private int capacity;
    private int size;

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
        return size;
    }

    public void add(int value) {
        if (this.size == capacity) {
            this.array = new int[this.capacity*2];
        }
        this.array[size] = value;
        this.size ++;
        System.out.println("Original Array : "+ Arrays.toString(this.array));
    }

    public int get(int index) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    public void remove(int indexToBeRemoved) {
    }

    public void insert(int index, int newValue) {
    }
}
