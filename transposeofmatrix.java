import java.util.*;
public class transposeofmatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[cols][rows];
        for(int i = 0; i < cols;i++){
            for(int j=0;j<rows;j++){
                matrix[i][j] = sc.nextInt();
            }
            
        }
        for(int i=0; i < cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        for(int i=0; i < rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
            
        }
}
