package v1.datastructures.impl;

import v1.datastructures.MinHeap;

public class MinHeapImpl implements MinHeap {
    int size;
    int capacity;
    int arr[];

    public MinHeapImpl(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        arr = new int[capacity+1];
        arr[0] = Integer.MIN_VALUE;
    }

    @Override
    public void insertElement(int n) {
        insert(n);
    }

    @Override
    public int size() {
        return size;
    }

    public void insertCheck(int n){

        if(isFull() && n < getTop()){
            return;
        }

        int top = getTop();
        arr[1] = n;
        sinkDown(1);
    }

    public void insert(int n){
        if(!isFull()){
            arr[++size] = n;
            bubbleup(size);
        }
    }

    private boolean isEmpty(){
        return size == 0;
    }

    @Override
    public int delete() {
        int res = Integer.MIN_VALUE;
        if(!isEmpty()){
            res = getTop();
            // replace the last element with first
            arr[1] = arr[size];
            arr[size] = 0;
            size--;
            sinkDown(1);
        }
        return res;
    }

    private void bubbleup(int idx){
        int currIdx = idx;
        int parIdx = idx / 2 ;

        while (currIdx < 0 || arr[currIdx] < arr[parIdx]){
            // swap parent and child
            swap(currIdx, parIdx);
            currIdx = parIdx;
            parIdx = parIdx / 2;
        }
    }

    private void sinkDown(int top) {
        if(top >= size)
            return;

        int parent = top;
        int leftChild = 2*parent;
        int rightChild = 2*parent + 1;
        int minIndex = top;

        if(leftChild <= size && arr[leftChild] < arr[minIndex]){
            minIndex = leftChild;
        }
        if(rightChild <= size && arr[rightChild] < arr[minIndex]){
            minIndex = rightChild;
        }

        if(minIndex != top){
            swap(top, minIndex);
            sinkDown(minIndex);
        }
    }

    private void swap(int child, int parent) {
        int tmp;
        tmp = arr[parent];
        arr[parent] = arr[child];
        arr[child] = tmp;
    }

    public int getTop() {
        return arr[1];
    }

    protected boolean isFull(){
        return size == capacity;
    }

    public void print(){
        for (int i=1; i<=size; i++){
            System.out.println(arr[i]);
        }
    }
}
