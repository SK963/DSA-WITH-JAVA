import java.util.Arrays;

public class Candy {


    // T : O(n) [3n]
    // S : O(n) [2n]
    public static int candy(int[] ratings) {
        int n = ratings.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = right[n-1] = 1;

        for(int i  = 1; i< n ; i++)
          left[i] = (ratings[i-1] <  ratings[i])?left[i-1]+1 :1;
        
        for(int i  = n-2; i>=0 ; i--)
            right[i] = (ratings[i] > ratings[i+1])?right[i+1]+1:1;

        int candies = 0;

        
        for(int i = 0 ; i< n ;i++)
            candies += Integer.max(left[i] , right[i]);
        
        
        return candies;
    }


    // T : O(n) : 2n
    // S : O(n) : n

    public static int candy2(int[] ratings) {
        int n = ratings.length;
        int left[] = new int[n];
        // int right[] = new int[n]; 

        left[0] = 1;

        for(int i  = 1; i< n ; i++)
          left[i] = (ratings[i-1] <  ratings[i])?left[i-1]+1 :1;
        
        int candies = 0;
        int curr = 1;
        int right = 1;
        for(int i  = n-2; i>=0 ; i--){
            if(ratings[i] > ratings[i+1]){
                curr = right+1 ;
                right = curr;
            }else curr = 1;

            candies += Integer.max(left[i], curr);
            
        }
        

        candies += Integer.max(left[n-1], 1);
        
        return candies;
    }


    // T : O(n) 
    // S : O(1)
    public static int candy3(int ratings[]){

        int i = 1;
        int sum = 1;
        int n = ratings.length;

        while(i < n){

            if(i < n && ratings[i] == ratings[i-1]){
                sum++;
                i++;
                continue;
            }

            int lpeak = 1;
            while(i< n && ratings[i] > ratings[i-1]){
                lpeak++;
                sum += lpeak;
                i++;
            }

            int rpeak = 1;
            while(i < n && ratings[i] < ratings[i-1]){
                sum+=  rpeak;
                i++;
                rpeak++;
            }

            if(rpeak > lpeak)sum += rpeak-lpeak;
        }


        return sum;


    }


    public static void main(String[] args) {

        System.out.println(candy3(new int[]{1,2,3,4}));
        System.out.println(candy3(new int[]{1,0,2}));
        
    }
    
}
