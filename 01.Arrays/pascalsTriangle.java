import java.util.*;


public class pascalsTriangle {
    public static List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> pascal = new ArrayList<>();
       
        
        for(int i = 1  ; i<= numRows ; i++){
            
            List<Integer> arr = new ArrayList<>();
            for(int j = 0 ;j < i ; j++){
                if(j == 0 || j == i-1)
                    arr.add(1);
                else {
                    List<Integer> prev = pascal.get(i-2);
                    arr.add(prev.get(j)+ prev.get(j-1));
                }

            }
            pascal.add(arr);
        }
        
        
        
        return pascal;
    }


    public static void main(String[] args) {
        int rows = 7;

        System.out.println(generate(rows));
    }

    
    
}
