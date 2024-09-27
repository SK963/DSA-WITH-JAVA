import java.util.*;

//Solution 
class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }

        //with arrays.sort 
        // Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        
        //without arrays.sort
        for(int i = 0 ; i< intervals.length ; i++){
                for(int j = i+1 ; j<intervals.length ; j++){
                    if(intervals[i][0]  >  intervals[j][0]){
                        int[] temp = intervals[i];
                        intervals[i] = intervals[j];
                        intervals[j] = temp;
                    }
                }
        }

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } 
            else {
               
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}


//Driver Code
public class MergeInterval{
    public static void main(String[] args) {

        int interval[][] = {{1,3},{2,6},{8,10},{15,18}};
        Solution obj = new Solution();
        int output[][] = obj.merge(interval);

        for(int i = 0 ; i < output.length ; i++){
            System.out.print(Arrays.toString(output[i]));
        }

        
        
    }
}

/*
output : [1, 6][8, 10][15, 18]

 */