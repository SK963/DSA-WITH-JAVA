import java.util.*;


public class BinarySearch{

	public static void binarySearch(int arr[], int key){
		int first = 0;
		int last = arr.length -1;
		int mid = (first + last)/2;
		
		while( first <= last ){
			if ( arr[mid] < key ){
				first = mid + 1;
			}else if ( arr[mid] == key ){
				System.out.println("Element is found at index: " + mid);
				break;
			}else{
				last = mid - 1;
			}
			mid = (first + last)/2;
		}
		if ( first > last ){
			System.out.println("Element is not found!");
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		int key = 3;
		binarySearch(arr, key);
		sc.close();
		
	}
}

