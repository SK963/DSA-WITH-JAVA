public class SqurareRoot {

    // 
    static int floorSqrt(int n) {

        if(n == 1)return n;

        int low = 1;
        int high = n;

        // int mid = -1;

        while(low < high-1){
            int mid = (low+high)/2;
            int midsquare = mid*mid;
            if(midsquare == n)return mid;
            else if(midsquare < n)low = mid;
            else high = mid;
        }

        return low;


        
    }
    
    static int floorSqrt2(int n) {

        if(n == 1)return n;

        int low = 1;
        int high = n;

       

        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            int midsquare = mid*mid;
            if(midsquare <= n){
                ans = mid;
                low = mid+1;
            }
            else high = mid-1;
        }

        return ans;


        
    }
    
    public static void main(String[] args) {

        System.out.println(floorSqrt2(4));//2
        System.out.println(floorSqrt2(11));//3
        System.out.println(floorSqrt2(1));//1
        
    }
    
}
