public class pract17{
    //want to find first and last element of array using binary search
    int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid; // Found target, but continue searching left
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
        int lastOccurrence(int[] arr, int target) {
            int low = 0, high = arr.length - 1, result = -1;
            // Binary search for the last occurrence of target
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target) {
                    result = mid; // Found target, but continue searching right
                    low = mid + 1;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            return result;

}
public static void main(String[] args) {
    pract17 p = new pract17();
    int[] arr = {1,1,1,1,1,1};
    int target = 1;
    int firstIndex = p.firstOccurrence(arr, target);
    int lastIndex = p.lastOccurrence(arr, target);
    if (firstIndex == -1) {
        System.out.println("Element not found in the array.");
    } else {
        System.out.println("First occurrence of element is at index: " + firstIndex);
        System.out.println("Last occurrence of element is at index: " + lastIndex);
    }
}
}