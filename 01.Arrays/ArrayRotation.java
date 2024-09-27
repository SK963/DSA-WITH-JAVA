import java.util.Arrays;

public class ArrayRotation {

// -------------------------------------------------------------------------------------------

    //approach1 : one by one method :T : O(n*d) (n: size of array , k: rotate by )

    //left rotation 
    public static void leftrotateOnebyOne(int arr[], int d)
    {
        int n = arr.length;
        /* To handle if d >= n */
        d = d % n;
        int p = 1;
        while (p <= d) {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = last;
            p++;
        }

        
        printArray(arr);
    }

    // right rotation
    public static void rigthrotateOnebyOne(int arr[] , int d){

        int n = arr.length;
        int p = 1;

        while(p <= d){
            int first = arr[n-1];
            for(int i = n-1; i> 0 ; i-- ){
                arr[i] = arr[i-1];
            }
            arr[0] = first;
            p++;

        }

        printArray(arr);

    }

// ----------------------------------------------------------------------------------------------
     // approach2 : using temp array S: O(d) , T O(n+d)
    //   left rotation 
    public static void leftrotateUsingTempArray(int arr[], int d)
     {

        int n = arr.length;
        d = d % n;

        // creating a temp array and inseting the first d elements    
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) 
             temp[i] = arr[i];
         
         

        // shifting elements by d position 
        for(int i = d ; i< n ; i++)
            arr[i-d] = arr[i];
         
        // copying the temp elements in the original array
         for(int i = n-d ; i < n ; i++){
            arr[i] = temp[i - (n-d)];
         }

        printArray(arr);
     }

    //  right rotation
    public static void rightrotateUsingTempArray(int arr[] ,  int d){
        int n = arr.length;
        d = d % n;

        // creating a temp array and inseting the last d elements    
        int temp[] = new int[d];
        for (int i = n-d,j = 0; i < n; i++ , j++) 
             temp[j] = arr[i];

        
        // shifting elements by d position 
        for(int i = n-1 ;  i >= d   ; i--)
            arr[i] = arr[i-d] ;
         
        // copying the temp elements in the original array
         for(int i = 0 ; i < d ; i++)
            arr[i] = temp[i];
         

        printArray(arr);


    }

// --------------------------------------------------------------------------------------------
    // using 
    //it rotates left only
    static void jugglingRotate(int arr[], int d)
    {
        int n = arr.length;
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }

        printArray(arr);
    }

    //finding gcd 
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

//-----------------------------------------------------------------------------------------
    // approach 4 : reverse rotate  :  T : O(2n) S : O(1)
    // left rotate by reversing
    public static void leftReverseRotate(int arr[], int d){

        int n = arr.length;
        d = d % n;

        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);


        printArray(arr);
    }

    // right reverse rotate  
    public static void rightReverseRotate(int[] nums, int k) {
        
        int n = nums.length;
        if(n < 2){

            printArray(nums);
            return;
        }
        k = k % n; // for handling k>=n
        k = n-k ; //make the left roatate to right rotate 

        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);


        printArray(nums);

    }

    /*Function to reverse arr[] from index start to end*/
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


   
// ----------------------------------------------------------------------------------
 
     // Function to print elements of array
     static void printArray(int arr[])
     {
         System.out.println(Arrays.toString(arr));
     }


// psvm
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 ,7};

        // Function calling
        System.out.println("Orignial array : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("One left rotation : ");
        leftrotateOnebyOne(new int[]{ 1, 2, 3, 4, 5, 6 ,7},1);
        System.out.println("One right rotation : ");
        rigthrotateOnebyOne(new int[]{ 1, 2, 3, 4, 5, 6, 7 },1);

        System.out.println("Three left rotation : ");
        leftrotateUsingTempArray(new int[]{ 1, 2, 3, 4, 5, 6,7 },3);

        System.out.println("Three right roation : ");
        rightrotateUsingTempArray(new int[]{ 1, 2, 3, 4, 5, 6,7 },3);
        // rightrotateUsingTempArray(new int[]{1,2,3,4,5,6}, 1); //testcase 

        // jugglingRotate(new int[]{ 1, 2, 3, 4, 5, 6 },3);

        System.out.println("Three left rotation : ");
        leftReverseRotate(new int[]{ 1, 2, 3, 4, 5, 6,7 },3);

        System.out.println("Three Right rotation : ");
        rightReverseRotate(new int[]{ 1, 2, 3, 4, 5, 6,7 },3);

        // rightReverseRotate(new int[]{-1},2);

        
       

    }
}
/*
Output
[1, 2, 3, 4, 5, 6]
[2, 3, 4, 5, 6, 1]
[3, 4, 5, 6, 1, 2]
[4, 5, 6, 1, 2, 3]
[5, 6, 1, 2, 3, 4]
 */