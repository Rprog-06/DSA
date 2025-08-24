
 import java.util.HashSet;

// public class pract60{
//     public static void main(String[] args) {
//         String s="abeaac";
//         int count=0;
//         HashSet<Character>st=new HashSet<>();
        
//         for(int i=0;i<s.length();i++){
//             st.add(s.charAt(i));
//         }
//         System.out.println(st.size());


//         }
        
// }
import java.util.HashSet;

public class pract60 {
    public static void main(String[] args) {
        String s = "abeaac";
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("Length of longest substring without repeating characters: " + maxLen);
    }
}
