import java.util.*;



public class SecondLargest {


    // approach 1 : sort and then find
    // T : O(n)   (nlgon +  n )
    public static int secondlargest1(int arr[]){
        if(arr.length < 2)
            return -1;

        
        Arrays.sort(arr);

        int max = arr[arr.length-1]; //last sorted element
        int max2 = arr[arr.length-2]; //second last sorted element

        int i = arr.length-2;

        //duplicated largest element
        while(max2 == max && i>0){
            i--;
            max2 = arr[i];
        }

        if(max == max2)
            return -1;

        return max2;

    }



    // approach2 : find largest and then a just smaller number then it 
    // T : O(n)   (2n)
    public static int secondlargest2(int arr[]){
        if(arr.length < 2)
            return -1;
            
        int small = Integer.MAX_VALUE;
        int second_small =  Integer.MAX_VALUE;


        int large =  Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;


        // find largest and smallest 
        for (int i = 0; i < arr.length ; i++){
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
        }

        //  find the number which is just smaller than max and just large than small
        for (int i = 0 ;i < arr.length ; i++){
            if (arr[i] < second_small && arr[i] != small)
                second_small = arr[i];
            
            if (arr[i] > second_large && arr[i] != large)
                second_large = arr[i];
            
        }

        if(second_large == Integer.MIN_VALUE)
            return -1;

        return second_large;

    }

    // approach 3

    public static int secondLargest3(int arr[]){

        if(arr.length < 2) return -1;
        
        int max = arr[0];
        int second = arr[1];
        
        for(int i = 1 ;i < arr.length ; i++){
            if(arr[i] > max ){
                second = max;
                max = arr[i];
            }
            else{
                if(arr[i] > second && arr[i] != max)
                    second = arr[i];
                
            }
            
            
             
        }
            
        if(max == second)
            return -1;
        
        return second;
            
        
    
    }


    public static void main(String[] args) {

        

        int arr1[] = {32011, 123, 1045, 1205, 254, 28763, 6537, 3161}; //28763
        int arr2[] = {10 ,5, 10}; //5
        int arr3[] = {10,10};


        // approach 1
        // System.out.println("Second largest element in arr1 : " + secondlargest1(arr1));
        // System.out.println("Second largest element in arr2 : " + secondlargest1(arr2));
        // System.out.println("Second largest element in arr3 : " + secondlargest1(arr3));

        // approach 2
        System.out.println("Second largest element in arr1 : " + secondlargest2(arr1));
        System.out.println("Second largest element in arr2 : " + secondlargest2(arr2));
        System.out.println("Second largest element in arr3 : " + secondlargest2(arr3));

        // appproach 3
        // System.out.println("Second largest element in arr1 : " + secondLargest3(arr1));
        // System.out.println("Second largest element in arr2 : " + secondLargest3(arr2));  
        // System.out.println("Second largest element in arr3 : " + secondLargest3(arr3));      


    
    }
    
}
