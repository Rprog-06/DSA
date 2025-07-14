import java.util.Scanner;

public class pract36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read matrix dimensions
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        // Create and populate the matrix
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Read the target element to find
        int target = scanner.nextInt();
        
        // Find and print the coordinates
        findCoordinates(matrix, target);
        
        scanner.close();
    }
    
    public static void findCoordinates(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("(" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }
}