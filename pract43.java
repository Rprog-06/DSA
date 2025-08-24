// public class pract43{
   

//     public static int findDuplicate(int[] nums) {
//         int slow = nums[0];
//         int fast = nums[0];

//         // Phase 1: Detect cycle
//         do {
//             slow = nums[slow];
//             fast = nums[nums[fast]];
//         } while (slow != fast);

//         // Phase 2: Find entrance to the cycle (duplicate)
//         slow = nums[0];
//         while (slow != fast) {
//             slow = nums[slow];
//             fast = nums[fast];
//         }

//         return slow;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 3, 4, 2, 2}; // Duplicate is 2
//         System.out.println("Duplicate number: " + findDuplicate(nums));
//     }
// }
import java.util.*;
public class pract43{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                
            
            if(arr[i]==arr[j]){
                System.out.println("Duplicate number is: " + arr[i]);
                return; // Exit after finding the first duplicate
            }
        }
    }

}
}