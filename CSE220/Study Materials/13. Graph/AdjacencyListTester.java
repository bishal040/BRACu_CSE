public class AdjacencyListTester {

    // use this website to draw Graph and convert to Adjacency Matrix https://graphonline.top/

    public static void main(String[] args) {
        //first paramter is the number of vertices, second parameter is true for undirected graph
        AdjacencyList graph = new AdjacencyList(7);
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 4, 1);
        
        graph.addEdge(1, 0, 1 );
        graph.addEdge(1, 3, 1);
        
        graph.addEdge(2, 1, 1);
        graph.addEdge(2, 3, 1);
        graph.addEdge(2, 6, 1);
        
        graph.addEdge(3, 2, 1);
        graph.addEdge(3, 5, 1);
        
        graph.addEdge(4, 1, 1);
        graph.addEdge(4, 3, 1);
        graph.addEdge(4, 4, 1);
        graph.addEdge(4, 6, 1);
        
        graph.addEdge(5, 0, 1);
        graph.addEdge(5, 4, 1);
        graph.addEdge(5, 5, 1);
        
        graph.addEdge(6, 3, 1);

        graph.showAdjList();

        System.out.println(".....Converting an UnDirected Adj Matrix to Adj List.....");
        int[][] adj_Matrix = {
            {0,  2,  0,  0,  3,  0,  0},
            {2,  0,  4,  5,  0,  0,  0},
            {0,  4,  0,  6,  0,  0,  7},
            {0,  5,  6,  0,  8,  9,  0},
            {3,  0,  0,  8,  0, 10, 11},
            {0,  0,  0,  9, 10,  0,  0},
            {0,  0,  7,  0, 11,  0,  0}
        };
        // Print the adjacency matrix
        AdjacencyMatrix.printMatrix(adj_Matrix);
        // Create a new AdjacencyList from the adjacency matrix
        AdjacencyList graphFromMatrix = new AdjacencyList(adj_Matrix);
        // Show the adjacency list created from the matrix
        System.out.println(".....Adjacency List from Matrix.....");
        graphFromMatrix.showAdjList();
        System.out.println(".....Checking if the edge 0-1 exists.....");
        boolean edgeExists = graphFromMatrix.hasEdge(0, 1);
        System.out.println("Does the edge 0-1 exist? " + edgeExists);
        System.out.println(".....Getting the edge weight of 5-3 exists.....");
        int weight = graphFromMatrix.getWeight(5, 3);
        System.out.println("Weight of the edge 5-3: " + weight);


        System.out.println(".....Converting an Directed Adj Matrix to Adj List.....");
        int[][] adj_Matrix2 = {
        //   0   1   2   3   4   5   6
            {0,  5,  0,  0,  7,  0,  0}, // 0
            {5,  0,  3,  6,  0,  0,  0}, // 1
            {0,  3,  0,  4,  0,  0,  8}, // 2
            {0,  6,  4,  0,  2,  9,  0}, // 3
            {7,  0,  0,  2,  0, 10, 11}, // 4
            {0,  0,  0,  9, 10,  0,  0}, // 5
            {0,  0,  8,  0, 11,  0,  0}  // 6
        };
        // Create a new AdjacencyList from the adjacency matrix
        AdjacencyList graphFromMatrix2 = new AdjacencyList(adj_Matrix2);
        // Show the adjacency list created from the matrix
        System.out.println(".....Adjacency List from Matrix.....");
        graphFromMatrix2.showAdjList();
    }

    
}
