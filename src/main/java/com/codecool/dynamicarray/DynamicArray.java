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
            int[] temporary = new int[this.capacity*2];
            for (int i = 0; i < this.capacity; i++) {
                temporary[i] = this.array[i];
            }
            this.array = temporary;
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
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (index >= capacity) {
            int[] temporary = new int[this.capacity+1];
            for (int i = 0; i < this.capacity; i++) {
                temporary[i] = this.array[i];
            }
            temporary[capacity] = newValue;
            this.array = temporary;
        } else {
            int[] temporary = new int[this.capacity+1];
            for (int i = 0; i < index; i++) {
                temporary[i] = this.array[i];
            }
            temporary[index] = newValue;
            for (int i = index+1; i < this.capacity; i++) {
                temporary[i+1] = this.array[i];
            }
            this.array = temporary;
        }
    }
}

//        if (index >= capacity) {
//                DynamicArray temporary = new DynamicArray(this.capacity+1);
//                for (int item : this.array) {
//                temporary.add(item);
//                }
//                temporary.add(newValue);
//                this.array = temporary;
////            this.array[capacity] = newValue;
