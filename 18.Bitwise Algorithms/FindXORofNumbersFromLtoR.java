public class FindXORofNumbersFromLtoR {

    public static int findXOR(int l, int r) {
        int xor = 0;
        for (int i = l; i <= r; i++) {
            xor = xor ^ i;
        }

        return xor;

    }

    public static int findXOR2(int l, int r) {

        return xor(l - 1) ^ xor(r);

    }

    static int xor(int n) {
        switch (n % 4) {
            case 0:
                return n;
            case 1:
                return 1;
            case 2:
                return n + 1;
            case 3:
                return 0;
            default:
                throw new IllegalArgumentException("Unexpected value: " + n % 4);
        }

    }

    public static void main(String[] args) {
        System.out.println(findXOR2(4, 8));
        // 4 = 0100
        // 5 = 0101
        // 6 = 0110
        // 7 = 0111
        // 8 = 1000
        // ans= 1422 (1000)
    }

}
