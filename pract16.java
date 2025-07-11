public class pract16{
    int recursiveBinarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Base case: target not found
        }
        
        int mid = low + (high - low) / 2; // Avoid overflow
        
        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] > target) {
            return recursiveBinarySearch(arr, target, low, mid - 1); // Search in the left half
        } else {
            return recursiveBinarySearch(arr, target, mid + 1, high); // Search in the right half
        }
    }
    public static void main(String[] args) {
        pract16 q = new pract16();
        int[] arr = {2, 4, 6, 8, 10};
        int target = 6;
        int result = q.recursiveBinarySearch(arr, target, 0, arr.length - 1);
        if (result == -1) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element is found at index: " + result);
        }
    }
}