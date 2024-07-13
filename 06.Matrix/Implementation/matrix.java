

public class matrix {

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int mat[][] = new int[n][m];


        for(int i = 0 ; i<  mat.length ; i++ ){
            for(int j = 0 ; j< mat[i].length ; j++ ){
                mat[i][j]= i+j;
            }
        }

        for(int i = 0 ; i<  mat.length ; i++ ){
            for(int j = 0 ; j< mat[i].length ; j++ ){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }


    }
    
}
