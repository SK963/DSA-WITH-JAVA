import java.util.Arrays;

public class RotateImage {


    // approach 1 : using a answer matrix
    // T : O(N^2) 
    // S : O(N^2)
    public static int[][] rotate1(int[][] matrix) {
        int n = matrix.length;
        int rotated[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        return rotated;
    }

    // approach 2 : transposing and rotation 
    // T : O(2N^2)
    // S : O(1)
    public static void rotate2(int[][] mat) {

        // transpose the matrix
        for(int i = 0 ; i< mat.length ; i++){
            for(int j = i ; j< mat[0].length ; j++){
                int temp = 0;
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i]  = temp;
            }
        }

        // reverse every row 
        for(int i = 0 ;i< mat.length ; i++){
            for(int j = 0 , k = mat[i].length-1 ; j < mat[i].length/2 ; j++,k-- ){
                int temp = mat[i][j];
                mat[i][j] = mat[i][k];
                mat[i][k] = temp;

            }
        }
        
        
    }


    public static void main(String[] args) {
        int mat1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int mat2[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate2(mat2);
        System.out.println(Arrays.deepToString( rotate1(mat1)));
        System.out.println(Arrays.deepToString(mat2));
        
    }
}
