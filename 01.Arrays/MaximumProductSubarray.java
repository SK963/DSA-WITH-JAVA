public class MaximumProductSubarray {

    //approach : brute
    // T : O(N^2) , S : O(1)
    public static int maxProduct(int arr[]){
        int maxproduct = arr[0];
        for(int i = 0 ; i< arr.length ;i++){
            int temp = arr[i];
            maxproduct = Integer.max(maxproduct, temp);
            for(int j = i+1 ; j<arr.length ; j++){
                temp *= arr[j];
                maxproduct = Integer.max(temp, maxproduct);
                
                
            }
            
        }

        return maxproduct;


    }


    // modified kadane's algo 
    // T : O(N) , S :O(1)
    public static int maxProduct2(int arr[]){
        int prod1 = arr[0],prod2 = arr[0],result = arr[0];
    
        for(int i=1;i<arr.length;i++) {
            int temp = Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
            prod2 = Math.min(arr[i],Math.min(prod1*arr[i],prod2*arr[i]));
            prod1 = temp;
            
            result = Math.max(result,prod1);
        }
        
        return result;
    }
    

    //approach :  prefix product and suffix product with a bit intuition
    //T : O(N) , S: O(1)
    
    public static int maxProduct3(int arr[]){
        int pre  = 1;
        int suf = 1;
        int max = arr[0];

        for(int i = 0 ; i< arr.length ; i++){
            pre *= arr[i];
            suf *= arr[arr.length-1-i];
            max = Integer.max(max , Integer.max(suf, pre));
            if(pre == 0)pre = 1;
            if(suf == 0) suf = 1;
            
        }

        return max;

    }



    public static void main(String[] args) {

        System.out.println(maxProduct2(new int[]{2,3,-2,4}));
        //6 : [2,3]
        System.out.println(maxProduct2(new int[]{-2,0,-1}));
        //0
        System.out.println(maxProduct2(new int[]{-2,3,-4}));
        //24
        System.out.println(maxProduct2(new int[]{0,2}));
        //2
        
    }
}
