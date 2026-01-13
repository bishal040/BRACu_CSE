import graph.AdjacencyList;
import graph.EdgeNode;
import helperDataStructure.QueueLL;
import helperDataStructure.StackLL;

public class GraphTraversal {

    public static void main(String[] args){

        int[][] adjMatrix = {
            { 0,  5,  0,  0,  0,  0,  0},
            { 5,  0,  0,  0,  0,  0,  0},
            { 0,  3,  0,  0,  0,  0,  0},
            { 0,  6,  4,  0,  0,  0,  0},
            { 7,  0,  0,  2,  7,  0,  0},
            {11,  0,  0,  9, 10,  0,  0},
            { 0,  0,  8,  0, 11,  0,  0},
        };
        AdjacencyList graph = new AdjacencyList( adjMatrix );
        //http://graphonline.top/?graph=GViecSskVHIaYCJe
        bfsTraversal(graph, 6);
        
        System.out.println("-------------------------------------------------");
        
        adjMatrix = new int[][]{
            {0, 0, 0, 0, 0, 0, 0 },
            {1, 0, 0, 0, 0, 0, 0 },
            {0, 1, 0, 0, 0, 0, 0 },
            {0, 1, 1, 0, 0, 1, 0 },
            {1, 0, 0, 1, 1, 0, 0 },
            {1, 0, 0, 0, 1, 0, 0 },
            {0, 0, 1, 0, 1, 0, 0 }
        };
        graph = new AdjacencyList( adjMatrix );
        //http://graphonline.top/?graph=GViecSskVHIaYCJe
        dfsTraversal(graph, 6);
    }

    public static void bfsTraversal( AdjacencyList graph, int start ) {
        int[] traversed = new int[graph.adjacencyList.length];
        int t=0;
        QueueLL q = new QueueLL();

        // BFS Traversal
        boolean[] visited = new boolean[graph.adjacencyList.length];
        q.enqueue(start); // The starting vertex
        while (!q.isEmpty()) {
            int current = (int)q.dequeue();
            visited[start] = true;
            traversed[ t++ ] = current; //storing the sequence of traversed vertices
            // Process the current node
            EdgeNode n = graph.adjacencyList[current];
            while (n != null) {
                int neighbor = n.toV;
                if (!visited[neighbor]) {
                    q.enqueue(neighbor);
                    visited[neighbor] = true;
                }
                n = n.nextEdge;
            }
        }
        System.out.println("BFS Traversal Order:");
        for (int i = 0; i < t; i++) {
            System.out.print(traversed[i] + " ");
        }
        System.out.println();
    }

    public static void dfsTraversal( AdjacencyList graph, int start ) {
        int[] traversed = new int[graph.adjacencyList.length];
        int t=0;
        StackLL stk = new StackLL();
        // DFS Traversal
        boolean[] visited = new boolean[graph.adjacencyList.length];
        stk.push(start); // Start from starting vertex
        while (!stk.isEmpty()) {
            int current = (int)stk.pop();
            if ( !visited[current] ) {
                visited[current] = true;
                traversed[ t++ ] = current;
                // Process the current node
                EdgeNode n = graph.adjacencyList[current];
                while (n != null) {
                    int neighbor = n.toV;
                    if ( !visited[neighbor] ) {
                        stk.push(neighbor);
                        visited[current] = true;
                    }
                    n = n.nextEdge;
                }
            }
        }
        System.out.println("DFS Traversal Order:");
        for (int i = 0; i < t; i++) {
            System.out.print(traversed[i] + " ");
        }
        System.out.println();
    }
    
}
