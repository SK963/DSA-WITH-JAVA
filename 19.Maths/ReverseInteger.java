public class ReverseInteger {

    public static int reverse(int x) {

        boolean sign = x > 0 ? true : false;
        x = Math.abs(x);
        

        int copy = x;
        int reverse = 0;

        while (copy > 0) {
            if(reverse > Integer.MAX_VALUE/10)return 0;
            reverse *= 10;
            reverse += (copy % 10) ;
            copy /= 10;
        }

        return sign ? reverse : -reverse;

    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(Integer.MIN_VALUE));
        System.out.println(reverse(Integer.MAX_VALUE));
        System.out.println(reverse(1534236469)); // 0 
        System.out.println(reverse(-2147483412)); // -2143847412
    }

}
