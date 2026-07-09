public class MinHeapToMaxHeap {
    static void convertMinToMaxHeap(int N, int arr[]) {
     
        
        
        for(int i = N-1 ; i > 0 ; i--){
            
            int p = parent(i);
            while(p >= 0 && arr[p] < arr[i]){
                p = parent(p);
            }
            
            int temp = arr[i];
            arr[i]= arr[p];
            arr[p]= temp;
        }
        
    }

    static int parent(int ind){
        return (ind-1)/2;
    }



    // 
    static void convertMinToMaxHeap2(int N, int arr[]) {        
        for(int i = N-2/2 ; i >= 0 ; i--){
            maxHeapify(arr, i , N);
        }
        
    }
    
    
    static void maxHeapify(int arr[] , int i , int N){
        int l = 2*i+1;
        int r = 2*i+2;
        
        int large = i;
        
        if( l < N && arr[l] > arr[large])large = l;
        if(r < N && arr[r]> arr[large])large = r;
        if(large != i){
            int temp = arr[large];
            arr[large] = arr[i];
            arr[i] = temp;
            maxHeapify(arr , large , N);
        }
        
    }


}
