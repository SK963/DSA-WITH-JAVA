import java.util.ArrayList;
import java.util.Stack;


// Topics : Array , Dynamic Programming , Greedy

public class BestTimeToBuyAndSellStockII {

    public static int maxProfit(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> profits = new ArrayList<>();
        
        stack.push(prices[0]);
        for(int i = 1 ; i< prices.length ; i++)
        {
            if(stack.peek() < prices[i]){
                profits.add(prices[i] - stack.peek());
                
            }
            stack.push(prices[i]);
            

        }

        int profit = 0;

        for(int num : profits)
           profit += num; 
        
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4})); //7
        System.out.println(maxProfit(new int[]{1,2,3,4,5})); //4
        System.out.println(maxProfit(new int[]{7,6,4,3,1})); //0


    }
    
}
