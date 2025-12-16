import java.util.Arrays;

public class CountPrimes {
    // T  : O(n.m)
    public int countPrimes(int n) {
        int cnt = 0;
        for(int i = 2 ; i< n ; i++){
            boolean isprime = true;
            for(int j = 2 ; j<= i ; j++){
                if(i != j && i%j == 0)isprime = false;
            }
            if(isprime)cnt++;
        }

        return cnt;
        
    }

    // approach : sieve of eratoshenes
    // T : O(n.loglogn) + 2n
    public static int countPrimes2(int n){

        if(n <= 2)return 0;

        boolean primes[] = new boolean[n];

        Arrays.fill(primes , true);//n
        primes[0] = primes[1]= false;
        
        // n.loglogn
        for(int i = 2 ;i*i < n ; i++ ){
            if(primes[i]){
                for(int j = i*i ; j< n ; j+= i){
                    primes[j] = false;
                }
            }
        }

        int cnt= 0;

        // n
        for(int  i = 0 ; i< primes.length  ;i++){
            if(primes[i])cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes2(10));
        System.out.println(countPrimes2(499979));
        
    }
    
}
