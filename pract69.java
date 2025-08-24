public class pract69 {
    public static void main(String[] args) {
        char[][] mat = {
            {'A', 'B'},
            {'C', 'D'}
        };
        String word = "AC";

        boolean found = exist(mat, word);
        System.out.println("Word Found: " + found);
    }

    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        // Try every cell as a starting point
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Recursive DFS
    public static boolean dfs(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) return true;

        // Boundary + mismatch check
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length ||
            board[i][j] != word.charAt(index)) {
            return false;
        }

        // Mark visited
        char temp = board[i][j];
        board[i][j] = '#';

        // Explore neighbors: up, down, left, right
        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                        dfs(board, word, i - 1, j, index + 1) ||
                        dfs(board, word, i, j + 1, index + 1) ||
                        dfs(board, word, i, j - 1, index + 1);

        // Restore value (backtrack)
        board[i][j] = temp;

        return found;
    }
}