import java.util.Arrays;

public class LCMAndGCD {
    public static int[] lcmAndGcd(int a, int b) {
        int dd = a>b?a:b;
        int ds = a<b?a:b;
         
         
         int r = dd%ds;
         
         while(r != 0){
             dd = ds;
             ds = r;
             r = dd%ds;
             
         }
         
         return new int[]{(a*b)/ds , ds};
     }


     public static void main(String[] args) {

        System.out.println(Arrays.toString(lcmAndGcd(5, 10)));
        System.out.println(Arrays.toString(lcmAndGcd(14, 8)));
        
     }
}
