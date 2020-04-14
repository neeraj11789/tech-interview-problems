package datastructures.impl;

import datastructures.MinHeap;

import java.util.ArrayList;
import java.util.List;

public class MinHeapListImpl implements MinHeap {

    List<Integer> list;

    public MinHeapListImpl() {
        this.list = new ArrayList<>();
        list.add(Integer.MIN_VALUE);
    }

    @Override
    public void insert(int x) {
        list.add(x);
        bubbleUp();
        List<Integer> ls = new ArrayList<>();
    }

    private void bubbleUp() {
        int currPos = lastIndex();
        int parPos = lastIndex() / 2;

        while (parPos >= startIndex()){
            if(list.get(parPos) > list.get(currPos))
                swap(parPos, currPos);

            currPos = parPos;
            parPos = currPos / 2;
        }
    }

    private void swap(int parPos, int currPos) {
        int tmp = list.get(parPos);
        list.set(parPos, list.get(currPos));
        list.set(currPos, tmp);
    }

    @Override
    public int delete() {
        int top = list.get(1);

        swap(1, lastIndex());
        list.remove(lastIndex());
        shrinkDown(1);

        return top;
    }

    private void shrinkDown(int i) {
        int parentPos = i;
        int leftChildPos = getLeftChildPos(i);
        int rightChildPos = getRightChildPos(i);
        int smallestPos = parentPos;

        if(leftChildPos <= lastIndex() && list.get(leftChildPos) < list.get(smallestPos)){
            smallestPos = leftChildPos;
        }

        if(rightChildPos <= lastIndex() && list.get(rightChildPos) < list.get(smallestPos)){
            smallestPos = rightChildPos;
        }

        if(smallestPos != parentPos){
            swap(smallestPos, parentPos);
            shrinkDown(smallestPos);
        }
    }

    private int getLeftChildPos(int n){
        return 2 * n;
    }

    private int getRightChildPos(int n){
        return (2 * n) + 1;
    }

    @Override
    public void insertElement(int n) {
        insert(n);
    }

    @Override
    public int size() {
        return list.size();
    }

    private int lastIndex(){
        return size() - 1;
    }

    public boolean isEmpty(){
        return size() == 1;
    }

    public int startIndex(){
        return 1;
    }

    @Override
    public void print(){
        for (int i = 1; i <= lastIndex() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
