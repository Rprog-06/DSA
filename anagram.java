import java.util.*;
//I wanrt that similar anagram string should be in the same list of 2-D list
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        String[] arr = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        List<List<String>> anagramGroups = groupAnagrams(arr);
        
        System.out.println("Anagram groups:");
        for (List<String> group : anagramGroups) {
            System.out.print(group);
        }
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}