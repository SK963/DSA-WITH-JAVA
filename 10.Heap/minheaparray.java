import java.util.Arrays;
import java.util.PriorityQueue;

class MinHeap {

    private int arr[];
    private int size;
    private int length;

    public String toString(){
        return Arrays.toString(arr);

    }


    public MinHeap(int len){
        arr = new int[len];
        this.size = len;
        this.length = 0;


    }


    public void add(int element){
        if(this.length < this.size){
            this.arr[this.length++] = element;
            heapify(length-1);
        }

    }

    // remove any element from heap
    // public boolean remove(int element){

    // }


    private void heapify(int idx){
        int parent = (idx-1)/2;

        //max heap
        if(parent >= 0){
            if(arr[parent] > 0){
                if(arr[idx] > arr[parent]){
                    swap(idx, parent);
                    heapify(parent);
                
                }

            }
        }
        else
            return ;


    }

    private void swap(int idx1 , int idx2){
        int temp = arr[idx1];
        arr[idx1] =  arr[idx2];
        arr[idx2]  = temp;
    }


    // retrive the top/root element and delete it
    public int poll(){
        int top = arr[0];
        arr[0] = arr[length-1];
        heapify(0);
        length--;
        return top;

    }

    //retrive the top/root  element 
    public int peek(){
        return arr[0];

    }

    public int size(){
        return this.length;
    }



    
}

public class MinHeapArray{
    public static void main(String[] args) {
        MinHeap m1 = MinHeap(10);
        m1.add(10);
        m1.add(20);
        m1.add(30);
        

        System.out.println(m1);
    }

}