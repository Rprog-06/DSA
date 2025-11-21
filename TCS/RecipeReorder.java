import java.util.*;
import java.io.*;

public class RecipeReorder {

    /**
     * Solves the minimum cut-and-insert operation problem using the 
     * Longest Increasing Subsequence (LIS) algorithm in O(N log N) time.
     * * @param N The number of instructions.
     * @param shuffledInstructions The list of instructions in the shuffled order.
     * @param originalInstructions The list of instructions in the original order.
     * @return The minimum number of cut-and-insert operations.
     */
    public static int solve(int N, List<String> shuffledInstructions, List<String> originalInstructions) {
        // Step 1: Create a map of instruction to its correct index (1-based) in the original list.
        Map<String, Integer> originalIndexMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            // Using 1-based indexing for LIS logic clarity
            originalIndexMap.put(originalInstructions.get(i), i + 1); 
        }

        // Step 2: Create a sequence of original indices based on the shuffled list order.
        int[] indexSequence = new int[N];
        for (int i = 0; i < N; i++) {
            String instruction = shuffledInstructions.get(i);
            // The value is the correct final position of the instruction.
            indexSequence[i] = originalIndexMap.get(instruction); 
        }

        // Step 3: Find the Length of the Longest Increasing Subsequence (LIS)
        int lisLength = findLISLength(indexSequence);
        
        // Step 4: Calculate the minimum operations.
        // The minimum number of operations is N - LIS length.
        return N - lisLength;
    }

    /**
     * Finds the length of the LIS in O(N log N) time using patience sorting.
     * * @param arr The sequence of original indices from the shuffled list.
     * @return The length of the LIS.
     */
    private static int findLISLength(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // 'tails' stores the smallest tail of all increasing subsequences with length i+1.
        // It is strictly increasing and holds the current "piles" of the patience sort.
        int[] tails = new int[arr.length];
        int size = 0; // Current length of LIS

        for (int x : arr) {
            // Use Arrays.binarySearch to find the insertion point (i.e., the first element 
            // in 'tails' that is greater than or equal to x).
            // If x is not found, binarySearch returns (-(insertion point) - 1).
            int i = Arrays.binarySearch(tails, 0, size, x);
            
            // Adjust the index to the correct insertion point.
            if (i < 0) {
                i = -(i + 1);
            }
            
            // Replace the tail of the existing increasing subsequence (the smallest tail 
            // greater than or equal to x) with x, or start a new subsequence.
            tails[i] = x;
            
            // If x extends the longest increasing subsequence found so far, increase size.
            if (i == size) {
                size++;
            }
        }
        return size;
    }

    /**
     * Main method for reading input and executing the solution.
     */
    public static void main(String[] args) throws IOException {
        // Use BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read N
        int N = Integer.parseInt(br.readLine().trim());
        
        // Read "shuffled"
        br.readLine(); 
        
        // Read shuffled instructions
        List<String> shuffled = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            shuffled.add(br.readLine());
        }
        
        // Read "original"
        br.readLine();
        
        // Read original instructions
        List<String> original = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            original.add(br.readLine());
        }
        
        // Calculate and print the result
        int result = solve(N, shuffled, original);
        System.out.println(result);
    }
}