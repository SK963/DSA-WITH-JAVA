public class MultipleCatch {
    public static void main(String[] args) {
		int num1  = 6;
		int num2 = 2;
		@SuppressWarnings("unused")
        int result = 0;
		int[] arr = {1, 2, 3};
		
        try {
			
            result = num1/num2 ;
            System.out.println(arr[4]); // This will throw ArrayIndexOutOfBoundsException
        }
		catch(ArithmeticException e){
			System.out.println("ArithmeticException"+e);
		}
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
		//the generic exeption handles any other exception that may came 
        catch (Exception e) {
            System.out.println("Generic exception caught: " + e.getMessage());
        }
    }
}