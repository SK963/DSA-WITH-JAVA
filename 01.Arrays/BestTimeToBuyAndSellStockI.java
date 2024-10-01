
import java.util.Stack;

// Topics : Array , Dynamic Programming 

public class BestTimeToBuyAndSellStockI {

    public static int maxProfit(int[] prices) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(prices[0]);


        for(int i = 1 ; i< prices.length ; i++){
            if(stack.peek() < prices[i]){
                if(prices[i] -stack.peek() > max)
                    max = prices[i] -stack.peek() ;
            }
            else
                stack.push(prices[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));  //5 (6-1)
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));  //0 

    }
    
}

