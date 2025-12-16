import java.util.*;

public class JobSequencingProblem {
    public static ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {

        List<List<Integer>> list = new ArrayList<>();

        int max = 0;
        for (int i = 0; i < id.length; i++) {
            max = Integer.max(max, deadline[i]);
            list.add(Arrays.asList(id[i], deadline[i], profit[i]));
        }


        Collections.sort(list, (a, b) -> {
            if (!a.get(2).equals(b.get(2))) {
                return b.get(2) - a.get(2); // Sort by second element
            }
            return a.get(1) - b.get(1); // If equal, sort by third element
        });

        System.out.println(Arrays.deepToString(list.toArray()));
        int arr[] = new int[max];
        Arrays.fill(arr, -1);

        int total = 0;
        int jobs = 0;

        for(List<Integer> li : list){

            int dl = li.get(1)-1;
            int prof  = li.get(2);


            while(dl >= 1 && arr[dl] != -1){
                dl -= 1;
            }

            if(arr[dl] == -1){
                arr[dl] = prof;
                total += prof;
                jobs++;
            }

        }

        

        
        return new ArrayList<>(Arrays.asList(jobs , total));

    }

    public static void main(String[] args) {

        System.out.println(JobSequencing(new int[] { 1, 2, 3, 4}, new int[] { 4, 1, 1, 1  }, new int[] { 20, 1, 40, 30  }).toString());
        System.out.println(JobSequencing(new int[] { 1, 2,3,4,5 }, new int[] { 2, 1,2, 1,1 }, new int[] { 100,19,27,25,15 }).toString());

    }
}