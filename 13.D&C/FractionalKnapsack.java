import java.util.Arrays;

import java.util.Comparator;

public class FractionalKnapsack {

    static  class ItemValue{
        int weight;
        int profit;

        ItemValue(int weight , int profit)
        {
            this.weight = weight;
            this.profit = profit;
        }
    }


    public static double getMaxValue(ItemValue[] arr  , int capacity){
        Arrays.sort(arr, new Comparator<ItemValue>()
		{
            public int compare(ItemValue item1 , ItemValue item2)
			{
                double cpr1 = Double.valueOf(item1.profit/item1.weight);
                double cpr2 = Double.valueOf(item2.profit / item2.weight);

                if(cpr1 < cpr2)
                    return 1;
                else
                    return -1;
            }
        });

        double totalValue = 0;

        for(ItemValue i : arr)
        {
            int curWt = (int)i.weight;
            int curpft = (int)i.profit;

            if(capacity - curWt >= 0){
                capacity -= curWt;
                totalValue += curpft;
            }
            else{
                double fraction = (double) capacity/curWt;
                totalValue += (curpft*fraction);
                capacity -= (int)(capacity - (curWt*fraction));
                break;
            }
        }

        return totalValue;



    }
    

    public static void main(String[] args) 
    {

        ItemValue[] arr =  {
            new  ItemValue(10, 75),
            new  ItemValue(7, 45),
            new  ItemValue(5, 25),
            new  ItemValue(4,50),
            new  ItemValue(3, 30),
            new  ItemValue(9, 90),
            new  ItemValue(12, 100)
        };


        double max = FractionalKnapsack.getMaxValue(arr, 37);

        System.out.println("the maximum profit is = "+ max);






        
    }
    
}
