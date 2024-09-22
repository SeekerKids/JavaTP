import java.util.Scanner;

public class TPMOD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perkalian Matriks nxn ");
         System.out.print("n: ");
        int n = scanner.nextInt();

        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int[][] resultMatrix = new int[n][n];

        System.out.println("Isi matriks 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Isi matriks 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Hasil perkalian:");
        printMatrix(resultMatrix);
    }


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
