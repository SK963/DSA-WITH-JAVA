public class PowerOfTwo{
    public static  boolean isPowerOfTwo(int n) {
        if(n == 0)return false;
        if(n == Integer.MIN_VALUE)return false;
        return (n&(n-1))==0;
        
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(15));
        System.out.println(isPowerOfTwo(Integer.MIN_VALUE)); // edge test case
        System.out.println(isPowerOfTwo(0)); //edge test case
    }
}