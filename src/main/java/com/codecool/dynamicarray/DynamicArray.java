package com.codecool.dynamicarray;

import java.util.Arrays;

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
        int size = 0;
        for (int item : this.array) {
            if (item != 0) size ++;
        }
        return size;
    }

    public void add(int value) {
        if (size() <= capacity) {
            for (int i = 0; i < capacity-1; i++) {
                this.array[i] = this.array[i+1];
                this.array[this.capacity-1] = value;
            }
            System.out.println("Original Array : "+ Arrays.toString(this.array));
        } else {
            this.array = new int[this.capacity*2];
            this.array[this.capacity/2] = value;
        }
    }

    public int get(int index) {
        return 0;
    }

    public void remove(int indexToBeRemoved) {
    }

    public void insert(int index, int newValue) {
    }
}
