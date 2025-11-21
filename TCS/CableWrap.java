import java.util.*;
import java.io.*;

public class CableWrap {
    private static int N, M;
    private static char[][] grid;
    private static List<int[]> intersections;
    private static int minSwitches = Integer.MAX_VALUE;
    private static final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        grid = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine().replaceAll("\\s+", "");
            for (int j = 0; j < M; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        // Find all intersections (cells with 'R' or 'C')
        intersections = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 'R' || grid[i][j] == 'C') {
                    intersections.add(new int[]{i, j});
                }
            }
        }

        // If no intersections, no switches needed
        if (intersections.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Early exit if already unwrapped
        if (isUnwrapped()) {
            System.out.println(0);
            return;
        }

        // Backtrack to find the minimum switches
        backtrack(0, 0);

        System.out.println(minSwitches == Integer.MAX_VALUE ? 0 : minSwitches);
    }

    private static void backtrack(int index, int switches) {
        // Prune if current switches exceed the minimum found so far
        if (switches >= minSwitches) {
            return;
        }

        // If all intersections are processed, check if the cable is unwrapped
        if (index == intersections.size()) {
            if (isUnwrapped()) {
                minSwitches = Math.min(minSwitches, switches);
            }
            return;
        }

        // Option 1: Do not switch this intersection
        backtrack(index + 1, switches);

        // Option 2: Switch this intersection
        int[] pos = intersections.get(index);
        char original = grid[pos[0]][pos[1]];
        grid[pos[0]][pos[1]] = (original == 'R') ? 'C' : 'R';
        backtrack(index + 1, switches + 1);
        grid[pos[0]][pos[1]] = original; // backtrack
    }

    private static boolean isUnwrapped() {
        boolean[][] visited = new boolean[N][M];
        int totalC = 0;
        int connectedC = 0;
        Queue<int[]> queue = new LinkedList<>();

        // Find the first 'C' to start BFS
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 'C') {
                    totalC++;
                    if (queue.isEmpty() && (i == 0 || i == N - 1 || j == 0 || j == M - 1)) {
                        queue.add(new int[]{i, j});
                        visited[i][j] = true;
                        connectedC++;
                    }
                }
            }
        }

        // If no 'C's on the edge, check all 'C's
        if (queue.isEmpty()) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (grid[i][j] == 'C') {
                        queue.add(new int[]{i, j});
                        visited[i][j] = true;
                        connectedC = 1;
                        break;
                    }
                }
                if (!queue.isEmpty()) break;
            }
        }

        // Perform BFS
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] dir : dirs) {
                int ni = curr[0] + dir[0];
                int nj = curr[1] + dir[1];
                if (ni >= 0 && ni < N && nj >= 0 && nj < M && !visited[ni][nj] && grid[ni][nj] == 'C') {
                    visited[ni][nj] = true;
                    queue.add(new int[]{ni, nj});
                    connectedC++;
                }
            }
        }

        return connectedC == totalC;
    }
}