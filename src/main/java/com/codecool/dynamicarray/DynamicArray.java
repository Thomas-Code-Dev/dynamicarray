package com.codecool.dynamicarray;

import java.util.StringJoiner;

public class DynamicArray {
    private int[] array;
    private int capacity = 4;
    private int size;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[this.capacity];
    }

    public DynamicArray() {
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
            capacity *= 2;
            this.array = temporary;
        }
        this.array[size] = value;
        this.size ++;
    }

    public int get(int index) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    public void remove(int indexToBeRemoved) {
        if (indexToBeRemoved < 0 || indexToBeRemoved > this.size-1) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            this.array[indexToBeRemoved] = 0;
            this.size --;
        }
    }

    public void insert(int index, int newValue) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            int[] temporary = new int[this.capacity+1];
            for (int i = 0; i < this.capacity; i++) {
                if (i < index) {
                    temporary[i] = this.array[i];
                } else if (i == index) {
                    temporary[index] = newValue;
                } else {
                    temporary[i] = this.array[i-1];
                }
            }
            if (index >= capacity) {
                temporary[size] = newValue;
                this.capacity *= 2;}
            this.array = temporary;
            size++;
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            StringJoiner joiner = new StringJoiner(", ", "[", "]");
            for (int x : this.array) {
                if (x != 0) {
                    joiner.add(String.valueOf(x));
                }
            }
            return joiner.toString();
        }
    }
}

