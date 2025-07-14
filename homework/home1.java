public class home1 {

    public static String moveHash(String str) {
        int hashCount = 0;
        StringBuilder result = new StringBuilder();

        // First, count the number of '#' and build a string without them
        StringBuilder nonHashPart = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                hashCount++;
            } else {
                nonHashPart.append(ch);
            }
        }

        // Append all '#' at the beginning
        for (int i = 0; i < hashCount; i++) {
            result.append('#');
        }

        // Append the rest of the characters
        result.append(nonHashPart);

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Make#Some#to#World";
        String output = moveHash(input);
        System.out.println(output);  // Output: ###MakeSometoWorld
    }
}
