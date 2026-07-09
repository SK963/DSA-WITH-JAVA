import java.util.Arrays;

public class DisjointSet {

    int par[]; 

    DisjointSet(int n ){
        this.par = new int[n];
        for(int i = 0 ; i< n ; i++)par[i]= i;

    }

    int find(int x) {

        if(par[x]==x)return x;
        return find(par[x]);
       
    }

    void union(int x, int y) {
        int repx = find(x);
        int repy = find(y);

        par[repx] = repy; 
       
    }


    void print(){
        System.out.println(Arrays.toString(par));
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
