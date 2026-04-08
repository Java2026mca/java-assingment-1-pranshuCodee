import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Read matrix A
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        
        // Read matrix B
        int[][] B = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        
        // Multiply matrices: C = A × B
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        // Print result matrix C
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + (j < n - 1 ? " " : ""));
            }
            System.out.println();
        }
    }
}

        // TODO: Read two n×n matrices A and B, multiply them → print result C = A×B
        //       Input: matrix A row by row, then matrix B row by row
        //       Output: result matrix row by row, values separated by spaces
        //
        // Input:
        // 2
        // 1 2
        // 3 4
        // 5 6
        // 7 8
        //
        // Output:
        // 19 22
        // 43 50

    
