import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the dimention of the matrix
        System.out.println("Enter row and column of 1st matrix:");
        
        int row1 = scanner.nextInt();
        int col1 = scanner.nextInt();
        
        //Get the values in matrix
        System.out.println("Enter the elements of the first matrix:");
        int[][] matrix1 = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        // Get the dimention of 2nd matrix
        System.out.println("Enter row and column of 2nd matrix:");
        
        int row2 = scanner.nextInt();
        int col2 = scanner.nextInt();
        
        //Get the values in matrix
        System.out.println("Enter the elements of the second matrix:");
        int[][] matrix2 = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        if (col1 != row2) {
            System.out.println("The Matrix cannot be multiplied if the column of the first matrix is not equal the row of the second matrix");
        }
        else {
        
        int[][] product = new int[col1][row2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                for (int k = 0; k < col2; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        System.out.println("The product matrix is:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
        }
    }
}
