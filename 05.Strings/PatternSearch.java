public class PatternSearch {

   

    public  static int RabinKarpLasVegasSearch(String text, String pattern) {
        final int d = 256; //base
        final int q = 101; //prime 
        int n = text.length();
        int m = pattern.length();

        int pHash = 0, tHash = 0;
        int h = 1;  // h = d^(m−1) % q : Used to remove the leading character during rolling hash.

        for (int i = 0; i < m - 1; i++)
            h = (h * d) % q;

        for (int i = 0; i < m; i++) {
            pHash = (d * pHash + pattern.charAt(i)) % q; //Computes hash of pattern
            tHash = (d * tHash + text.charAt(i)) % q;     //Computes hash of first window of text
        }

        for (int i = 0; i <= n - m; i++) {
            // System.out.println("thash : "+ tHash + " phash : " + pHash);
            if (pHash == tHash) { //Hash match does NOT guarantee string match (collision possible) 
                int j = 0;
                while (j < m && text.charAt(i + j) == pattern.charAt(j)) //Character-by-Character Verification
                    j++;

                if (j == m)
                    return i;
            }

            if (i < n - m) {
                tHash = (d * (tHash - text.charAt(i) * h)
                        + text.charAt(i + m)) % q;

                if (tHash < 0)
                    tHash += q;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        System.out.println("the pattern is found at index :" + RabinKarpLasVegasSearch("ABCCDDAEFG", "CDD"));
    }

    
}
