public class LinearSearch{

    public static int linearSearch(int arr[] ,  int key){
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        int arr[]  = {4,5,6,7,8,9};
        int key = 7;
        System.out.println(key +" is present at : " + linearSearch(arr, key) );  
    }
}