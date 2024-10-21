import java.util.ArrayList;

public class LeadersInArray {
    
    // Expected Time Complexity: O(n)
    // Expected Auxiliary Space: O(n)
    public static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> leaders = new ArrayList<>();
        for(int i = arr.length-1 ; i >= 0 ; i--){
            if(leaders.isEmpty()) leaders.add(arr[i]);
            else{
                if(arr[i] >= leaders.get(0)) leaders.add(0,arr[i]);
            }
        }

        return leaders;

        
    }


    public static void main(String[] args) {
        System.out.println(leaders(new int[]{16,17,4,3,5,2}).toString());
    }
}
