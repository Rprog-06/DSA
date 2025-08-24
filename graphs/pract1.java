

import java.util.*;

public class pract1 {

    public static int findCenter(int[][] edges) {
        int n = edges.length + 1; // Since star graph with n nodes has n-1 edges
        List<List<Integer>> graph = new ArrayList<>();
        int[] degree = new int[n + 1]; // node numbers are from 1 to n

        // Step 1: Initialize graph
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Step 2: Build graph and degree array
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
            degree[u]++;
            degree[v]++;
        }

        // Step 3: BFS to find the node with degree == n - 1 (center)
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (degree[i] == n - 1) {
                return i;
            }
        }

        return -1; // Should never reach here for a valid star graph
    }

    public static void main(String[] args) {
        int[][] edges1 = {{1, 2}, {2, 3}, {4, 2}};
        int[][] edges2 = {{1, 2}, {5, 1}, {1, 3}, {1, 4}};

        System.out.println("Center of edges1: " + findCenter(edges1)); // Output: 2
        System.out.println("Center of edges2: " + findCenter(edges2)); // Output: 1
    }
}
