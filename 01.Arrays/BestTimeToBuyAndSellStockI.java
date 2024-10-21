
import java.util.Stack;

// Topics : Array , Dynamic Programming 

public class BestTimeToBuyAndSellStockI {

    //  T : O(n) , S: O(n)
    public static int maxProfit1(int[] prices) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(prices[0]);


        for(int i = 1 ; i< prices.length ; i++){
            if(stack.peek() < prices[i]) max = Integer.max(prices[i] - stack.peek() ,  max) ;
            else stack.push(prices[i]);
        }
        return max;
    }

    // T: O(n) , S:O(1)
    public static int maxProfit2(int[] prices){
        int maxprofit =0 , min = prices[0];
        for(int i = 1 ; i< prices.length; i++){
            int cost =  prices[i] - min;
            maxprofit = Integer.max(maxprofit, cost);
            min = Integer.min(min, prices[i]);

        }
        return maxprofit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit2(new int[]{7,1,5,3,6,4}));  //5 (6-1)
        System.out.println(maxProfit2(new int[]{7,6,4,3,1}));  //0 

    }
    
}

