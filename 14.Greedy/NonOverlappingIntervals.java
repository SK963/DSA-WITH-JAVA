import java.util.*;

public class NonOverlappingIntervals{

     public static int eraseOverlapIntervals(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });
         System.out.println(Arrays.deepToString(intervals));

        int count = 0;
        int n = intervals.length;
    
        for(int i = 0 ;i< n-1 ; i++ ){
           
            if(intervals[i][0] == intervals[i][1]) continue;
            int j = i+1;
            while(j < n && intervals[i][1] > intervals[j][0] ){
                intervals[j][0]=intervals[j][1] = 0;
                 System.out.println(Arrays.deepToString(intervals));
                
                count++;
                j++;
            }
        }    

        return count;
    }

    static class interval {
        int start;
        int end;
        int pos;

        interval(int start, int end, int pos) {
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }

    static class meetingComparator implements Comparator<interval> {
        @Override
        public int compare(interval o1, interval o2) {
            if (o1.end < o2.end)
                return -1;
            else if (o1.end > o2.end)
                return 1;
            else if (o1.pos < o2.pos)
                return -1;
            return 1;
        }
    }

    public static int eraseOverlapIntervals2(int intervals[][]) {
        int n = intervals.length;

        ArrayList<interval> meet = new ArrayList<>();
        for (int i = 0; i < n; i++)
            meet.add(new interval(intervals[i][0], intervals[i][1], i+1));

        meetingComparator mc = new meetingComparator();

        Collections.sort(meet, mc);

        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end;

        for (int i = 1; i < n; i++) {
            if (meet.get(i).start >= limit) {
                limit = meet.get(i).end;
                answer.add(meet.get(i).pos);
            }
        }

        // System.out.println(answer.toString());

        return n-answer.size();
    }
        
    


    public static void main(String args[]){
        System.out.println(eraseOverlapIntervals2(new int[][]{{1,2},{2,3},{3,4},{1,3}}));//1
        System.out.println(eraseOverlapIntervals2(new int[][]{{1,2},{1,2},{1,2}}));//2
        System.out.println(eraseOverlapIntervals2(new int[][]{{1,100},{11,22},{1,11},{2,12}})); //2
        System.out.println(eraseOverlapIntervals2(new int[][]{{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}})); //7

    }
}