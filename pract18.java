
import java.util.Scanner;

public class pract18 {
    // This class is empty, but you can add methods or properties as needed.
    // It serves as a placeholder for future implementations or extensions.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    //Apply selection sort

                    min_index = j;

                }

            }
            // Swap arr[i] and arr[min_index]
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
        System.out.print("Sorted elements are: ");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

    }
}
