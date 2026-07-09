import java.util.*;

public class TopKfreq {

    static class Node{
        int val;
        int freq;

        Node(int val , int freq){
            this.val = val;
            this.freq = freq;
        }
    }


    // firstapproach : 



    // hashmap + priorityqueue
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> freq = new HashMap<>();

        for(int n : nums){
            freq.put(n , freq.getOrDefault(n , 0)+1);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)-> a.freq -b.freq);
        
        for(Map.Entry<Integer, Integer> e : freq.entrySet()){
            pq.offer(new Node(e.getKey(), e.getValue()));
            if(pq.size() > k ){
                pq.poll();

            }
        }


        int[] res = new int[k];
        int i = 0;

        while (!pq.isEmpty())
            res[i++] = pq.poll().val;

        return res;

        
    }


    // without using node subclass 
    public static int[] topKFrequent2(int[] nums, int k) {
        HashMap<Integer , Integer> freq = new HashMap<>();

        for(int n : nums){
            freq.put(n , freq.getOrDefault(n , 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)-> a.getValue() -b.getValue());
        
        for(Map.Entry<Integer, Integer> e : freq.entrySet()){
            pq.offer(e);
            if(pq.size() > k ){
                pq.poll();

            }
        }


        int[] res = new int[k];
        int i = 0;

        // n.log(n)  (k==n)
        while (!pq.isEmpty())
            res[i++] = pq.poll().getKey();

        return res;

        
    }


    // bucket sort
    // T : O(N) , exactly = 2N
    // S : O(N)
    public static int[] topKFrequent3(int nums[] , int k){

        ArrayList<Integer>bkt[] = new ArrayList[nums.length+1];
        for(int i = 0 ; i< bkt.length ; i++){
            bkt[i] = new ArrayList<>();
        }

        HashMap<Integer,Integer> freq = new HashMap<>();


        for(int n : nums){
            freq.put(n, freq.getOrDefault(n, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> e : freq.entrySet()){
            int ind = e.getValue();
            bkt[ind].add(e.getKey());
        }

        int ans[] = new int[k];
        int topk = 0;
        for(int i = bkt.length-1 ; i >=0 && topk < k;i--){
            ArrayList<Integer> bk = bkt[i];
            while(topk<k && !bk.isEmpty())ans[topk++]= bk.remove(bk.size()-1);
        }

        return ans;
        
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(topKFrequent(new int[]{1,2,2,3,3,3}, 2)));
        System.out.println(Arrays.toString(topKFrequent2(new int[]{1,2,2,3,3,3}, 2)));
        System.out.println(Arrays.toString(topKFrequent3(new int[]{1,2,2,3,3,3}, 2)));


        
    }
    
}

