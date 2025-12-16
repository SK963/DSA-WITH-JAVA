public class SetTheRightmostUnsetBit {

    static int Settherightmostunsetbit(int n){
        int ind = 0;
        int temp = n;
        while((temp &1)==1){
            ind++;
            temp = (temp>>1);
        }

        return (n|(1<<ind));

    }


    public static void main(String[] args) {
        System.out.println(Settherightmostunsetbit(9));
        System.out.println(Settherightmostunsetbit(8));
    }
    
}
