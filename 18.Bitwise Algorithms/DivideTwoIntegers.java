public class DivideTwoIntegers {

    public static int divide2(int dividend , int divisor){
        

        boolean negative = (dividend < 0) ^ (divisor < 0);
        
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        long quotient = 0;

        while (absDividend >= absDivisor) {
            int tempcnt = 0;

            
            while (absDividend >= (absDivisor << (tempcnt + 1)))
                tempcnt++;

            
            absDividend -= absDivisor * (1L << tempcnt);
            quotient += (1L << tempcnt);
        }

  
        quotient = negative ? -quotient : quotient;

  
        if (quotient > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (quotient < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) quotient;
    }

    public static void main(String[] args) {

        System.out.println(divide2(10, 3));
        System.out.println(divide2(-2147483648, 1));

    }

}
