import java.util.*;


public class pascalsTriangle {

// ------------------------------------------------------------------------
    // using recurssion 
    public static int pascalelement1(int row , int col){
        if(row == 1 || row == 2){
            return 1;
        }
        if(col == 1 || col == row){
            return 1;
        }

        return pascalelement1(row-1, col-1) + pascalelement1(row-1 , col);
    } 

    // approach 1 : using recurrsion
    public static List<List<Integer>> generate1(int numRows) 
    {
        List<List<Integer>> pascal = new ArrayList<>();
       
        
        for(int i = 1  ; i<= numRows ; i++){
            
            List<Integer> arr = new ArrayList<>();
            for(int j = 1 ;j <= i ; j++)
                    arr.add(pascalelement1(i, j));
            
            pascal.add(arr);
        }
        
        
        
        return pascal;
    }


// -------------------------------------------------------------------------

    // approach 2 : using combinatorics
    
    public static List<List<Integer>> generate2(int numRows) 
    {
        List<List<Integer>> pascal = new ArrayList<>();
       
        
        for(int i = 1  ; i<= numRows ; i++){
            
            List<Integer> arr = new ArrayList<>();
            for(int j = 1 ;j <= i ; j++)
                    arr.add(pascalelement2(i, j));
            
            pascal.add(arr);
        }
        
        
        
        return pascal;
    }

    //  using cobinatorics : r-1_C^c-1 for pascal element
    // T : O(col)
    public static int pascalelement2(int row , int col){
        --row;
        --col;

        int res = 1;
        for(int i = 0 ; i< col ; i++){
            res = res * (row-i);
            res = res/(i+1);

        }

        return res;

    }

//-------------------------------------------------------------------------- 
    // approach 3 : using dp
    public static List<List<Integer>> generate3(int numRows) 
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




// ---------------------------------------------------------------------

    public static void main(String[] args) {
        int rows = 7;


        // approach 1 : using recurrsion
        System.out.print("using recurrsion : ");
        System.out.println(pascalelement1(5, 3)); //  : 1 based ans : 6
        System.out.println(generate1(rows));

        // approach 2 : combinatorics
        System.out.print("using combinatorics : ");
        System.out.println(pascalelement2(5, 3)); // (5,5) or (4,4) 1 based //   ans : 6
        System.out.println(generate2(rows));

        // approach 3 :  dp
        System.out.println("using dp : ");
        System.out.println(generate3(rows));

    }

    
    
}
