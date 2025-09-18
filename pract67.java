public class pract67 {
    
    static void printSubsets(int[] arr, int index, String current) {
        if(index == arr.length) {
            System.out.print(current+"\n");
            return;
        }
        
        // Include arr[index] in subset
        printSubsets(arr, index + 1, current + arr[index] + " ");
        
        // Exclude arr[index] from subset
        printSubsets(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        printSubsets(arr, 0, "");
    }
}
