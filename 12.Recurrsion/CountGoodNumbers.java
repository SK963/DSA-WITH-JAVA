public class CountGoodNumbers {

    static long M = 1000000007;
    public static int countGoodNumbers(long n) {
        long temp = power(20, n/2, 1);
        return ((n%2) == 1) ? (int)((temp * 5) % M) : (int)temp;  
        
    }


    static long power( long b, long e, long ans) {
        if(e == 0) return ans;
        if(e%2 == 1) return power(b, e - 1, (ans * b) % M);
        else return power((b * b) % M, e / 2, ans);
    }




    public static void main(String[] args) {
        System.out.println(countGoodNumbers(1)); //5
        System.out.println(countGoodNumbers(2)); //20
        System.out.println(countGoodNumbers(3)); //50
        System.out.println(countGoodNumbers(4)); //400
        System.out.println(countGoodNumbers(5)); //2000
        System.out.println(countGoodNumbers(50));//564908303
    }
    
}
