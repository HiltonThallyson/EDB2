package br.ufrn.imd.edb2.uni2.hilton;

public class HeapSort {
    private int size;
    private int index;

    public HeapSort(int [] array) {
        this.sortHeap(array);
    }

    public int getSize() {
        return size;
    }

    public int getIndex() {
        return index;
    }

    public void sortHeap(int[] array) {
        size = array.length;
        index = size/2;
        heapifyUp(index, array);
        heapifyUp(index -1, array);
        moveRoot(array, size);
    }

    private void moveRoot(int array [], int size) {
        int tmp = array[0];
        if(size == 1){
            return;
        }else{
            array[0] = array[size - 1];
            array[size-1] = tmp;
            System.out.println(array[0]);
            heapifyDown(0, array, size);
            moveRoot(array, size - 1);
        }
    }

    private void heapifyUp(int index, int [] array){
        if(!hasParent(index)){
            return;
        }
        int parentIndex = getParentIndex(index);
        int filho = array[index];
        int pai = array[parentIndex];

        if(filho > pai){
            array[index] = pai;
            array[parentIndex] = filho;
            heapifyUp(parentIndex, array);
        }
    }

    private void heapifyDown(int index, int [] array, int tmpSize) {
        int leftChild = index*2 + 1;
        int rightChild = index *2 + 2;

        int childIndex = -1;
        if(leftChild < tmpSize){
            childIndex = leftChild;
        }

        if(childIndex < 0){
            return;
        }

        if(rightChild <  tmpSize){
            if(array[rightChild] > array[leftChild]){
                childIndex = rightChild;
            }
        }

        if(array[index] < array[childIndex]) {
            int tmp = array[index];
            array[index] = array[childIndex];
            array[childIndex] = tmp;
            heapifyDown(childIndex, array, tmpSize);
        }
    }

    private boolean hasParent(int index){
        return getParentIndex(index) >= 0 && getParentIndex(index) < size;
    }

    private int getParentIndex(int index) {
        return (int) Math.floor((index-1) / 2);
    }
}
