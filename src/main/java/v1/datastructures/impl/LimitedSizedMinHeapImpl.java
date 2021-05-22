package v1.datastructures.impl;

public class LimitedSizedMinHeapImpl extends MinHeapImpl {
    public LimitedSizedMinHeapImpl(int capacity) {
        super(capacity);
    }

    /**
     * Insert New Element if it is greater than the current minElement
     */
    @Override
    public void insertElement(int n){
        if(!isFull()){
            insert(n);
        }else {
            if( n > getTop()){
                // delete top and insert
                delete();
                insert(n);
            }
        }
    }
}
