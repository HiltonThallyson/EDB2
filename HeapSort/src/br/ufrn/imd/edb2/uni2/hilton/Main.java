package br.ufrn.imd.edb2.uni2.hilton;

public class Main {

    public static void main(String[] args) {
	    int array[] = {7,10,15,3,9,11,4,10,11};
	    HeapSort heap = new HeapSort(array);
        for (int i = 0; i < heap.getSize(); i++){
            System.out.println(array[i]);
        }
    }
}
