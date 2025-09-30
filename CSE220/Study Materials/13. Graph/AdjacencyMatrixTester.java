public class AdjacencyMatrixTester {
    public static void main(String[] args) {

        // use this website to draw Graph and convert to Adjacency Matrix https://graphonline.top/
        System.out.println(".....Creating Adjacency Matrix Manually.....");
        int[][] adj_Matrix = {
            {0, 1, 0, 0, 1, 0, 0},
            {1, 0, 1, 1, 0, 0, 0},
            {0, 1, 0, 1, 0, 0, 1},
            {0, 1, 1, 0, 1, 1, 0},
            {1, 0, 0, 1, 0, 1, 1},
            {0, 0, 0, 1, 1, 0, 0},
            {0, 0, 1, 0, 1, 0 ,0}
        };
        // Print the adjacency matrix
        AdjacencyMatrix.printMatrix(adj_Matrix);
        
        
        //first paramter is the number of vertices, second parameter is true for undirected graph
        AdjacencyMatrix graph = new AdjacencyMatrix(7, true);
        System.out.println(".....Using methods to add edges.....");
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

        AdjacencyMatrix.printMatrix(graph.matrix);

        System.out.println(".....Checking Directed or Not.....");
        boolean isDirected = AdjacencyMatrix.checkDirected(graph.matrix);
        System.out.println("Is the graph directed? " + isDirected);

    }
}
