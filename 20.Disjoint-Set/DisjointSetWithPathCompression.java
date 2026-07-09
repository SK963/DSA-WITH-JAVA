

public class DisjointSetWithPathCompression {


    public static class DisjointSet{
        int[] par , rank;
        int size;


        DisjointSet(int n){
            this.par = new int[n];
            this.rank = new int[n];  //{0,0,0....}
            this.size = n;

            for(int i = 0 ; i< n ; i++){
                par[i] = i;
            }
        }


        int find(int x){

            int xrep = par[x];

            if(par[xrep]!= xrep){
                return par[x] = find(xrep);
            }

            return xrep;
        }



        void union(int x , int y){
            
            int xrep = find(x);
            int yrep = find(y);

            if(xrep == yrep)return;


            if(rank[xrep] > rank[yrep]){
                par[yrep] = xrep;

            }
            else if(rank[xrep]< rank[yrep])par[xrep]= yrep;
            else{
                par[yrep] = xrep;
                rank[xrep] = rank[xrep]+1;
            }
        }
    }


    public static void main(String[] args) {
        DisjointSet dus = new DisjointSet(5);

        // 0 is a friend of 2
        dus.union(0, 2);

        // 4 is a friend of 2
        dus.union(4, 2);

        // 3 is a friend of 1
        dus.union(3, 1);

        // Check if 4 is a friend of 0
        if (dus.find(4) == dus.find(0))
            System.out.println("Yes");
        else
            System.out.println("No");

        // Check if 1 is a friend of 0
        if (dus.find(1) == dus.find(0))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}
