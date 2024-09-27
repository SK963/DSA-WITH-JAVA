import java.util.*;

public class UnionandIntersectionOfTwoSortedArrays {

    // approach 1 : using a map
    // public static ArrayList<Integer> findUnion1(int arr1[]  , int arr2[]){

    // }


    

    // approach 2 : using a set / hashset structure : T : O(n1longn + n2.longn) O(n1+n2)  S : O(n1+n2) 
    public static ArrayList<Integer> findUnion2(int arr1[], int arr2[]){
        Set<Integer> union = new TreeSet<>();
        for(int i = 0 ; i< arr1.length ; i++)
            union.add(arr1[i]);
        
        for(int i = 0 ; i< arr2.length ; i++)
            union.add(arr2[i]);
        

        return new ArrayList<>(union);

        
    }

    // approach 3 : iteration with two pointers T :O(n1+n2)  S:O(n1+n2)
    public static ArrayList<Integer> findUnion3(int arr1[], int arr2[]){
        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(i < arr1.length && j< arr2.length){

            if(arr1[i] > arr2[j] ){
                if(union.isEmpty() || union.get(union.size()-1) != arr2[j])
                    union.add(arr2[j]);
                j++;

            }
            else if(arr1[i] < arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }
            else if(arr1[i] == arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
                j++;
            }
            
        }


        while(i < arr1.length)
            if(union.isEmpty() || union.get(union.size()-1) != arr1[i])
                union.add(arr1[i++]);
        

        while(j < arr2.length)
            if(union.isEmpty() || union.get(union.size()-1) != arr2[j])
                union.add(arr2[j++]);

        return union;

        
    }


    public static ArrayList<Integer> findIntersection(int arr1[] , int arr2[]){
        ArrayList<Integer> intersection = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < arr1.length && j< arr2.length){

            if(arr1[i] > arr2[j] )
                j++;

            else if(arr1[i] < arr2[j])
                i++;
            
            else if(arr1[i] == arr2[j]){
                if(intersection.isEmpty() || intersection.get(intersection.size()-1) != arr1[i])
                    intersection.add(arr1[i]);
                i++;
                j++;
            }
            
        }

        return intersection;


    }
    public static void main(String[] args) {

        // findunion2
        System.out.println(findUnion2(new int[]{1,1, 2, 3, 4, 5}, new int[]{1, 2, 3, 6, 7}).toString());
        System.out.println(findUnion2(new int[]{-8 ,-3 ,8}, new int[]{-7 ,8}).toString());
        
        // findunion3
        System.out.println(findUnion3(new int[]{1,1, 2, 3, 4, 5}, new int[]{1, 2, 3, 6, 7}).toString());
        System.out.println(findUnion3(new int[]{-8 ,-3 ,8}, new int[]{-7 ,8}).toString());
        
        // findintersection
        System.out.println(findIntersection(new int[]{1,1, 2, 3, 4, 5}, new int[]{1, 2, 3, 6, 7}).toString());
        System.out.println(findIntersection(new int[]{-8 ,-3 ,8}, new int[]{-7 ,8}).toString());
        
    }
    
}
