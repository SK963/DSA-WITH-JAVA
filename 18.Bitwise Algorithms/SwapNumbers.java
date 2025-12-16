import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapNumbers {

    static List<Integer> swap(int a,int b)
    {
       a = a^b;
       b = a^b;
       a = a^b;
       
       return new ArrayList(Arrays.asList(a,b));
    }

    public static void main(String[] args) {
        
        System.out.println(swap(9,13));
        
    }
    
}
