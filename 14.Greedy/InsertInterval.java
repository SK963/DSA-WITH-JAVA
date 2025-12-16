import java.util.*;

public class InsertInterval{


    public static int[][] insert(int[][] intervals, int[] newInterval){


        List<int[]> ans = new ArrayList<>();
        int n = intervals.length;

        int i = 0;

        //left
        while(i < n && intervals[i][1]<newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }

        //overlapping
        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Integer.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Integer.max(newInterval[1], intervals[i][1]);
            i++;
        }
        ans.add(newInterval);

        //right
        while(i < n){
            ans.add(intervals[i]);
            i++;
        }

        int ansarr[][] = new int[ans.size()][2];

        int j =0;

        for(int[] an : ans){
            ansarr[j] = an;
            j++;
        }
        return ansarr;

    }



    public static void main(String args[]){

        System.out.println(Arrays.deepToString(insert(new int[][]{{1,3},{6,9}}  , new int[]{2,5})));

    }
}