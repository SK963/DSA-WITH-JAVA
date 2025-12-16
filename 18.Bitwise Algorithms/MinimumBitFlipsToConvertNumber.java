public class MinimumBitFlipsToConvertNumber {


    public static int minBitFlips(int start, int goal) {

        
        int cnt = 0;
        while((start !=0) || (goal !=0)){
            boolean left = ((start&1)==1);
            boolean right = ((goal&1)==1);

            int val = ((left^right)==true)?1: 0;
            cnt+=val;
            start = start>>1;
            goal = goal>>1;
        }

        return cnt;

        
    }


    public static int minBitFlips2(int start , int goal){
        
        int movements = start^goal;

        int count = 0;
        while(movements>0){
            count++;
            movements = (movements&(movements-1)); // count the number of flips / set bits 
        }

        return count;
    }


    public static void main(String[] args) {
        System.out.println(minBitFlips2(10, 7)); //3
        System.out.println(minBitFlips2(3    , 4));//3
        
    }
    
}
