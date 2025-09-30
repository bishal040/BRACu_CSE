package graph;

public class AdjacencyMatrix {

    public int[][] matrix;
    public boolean directed;

    public AdjacencyMatrix(int size, boolean directed) {
        this.directed = directed;
        matrix = new int[size][size];
    }

    public void addEdge(int source, int destination, int weight) {
        matrix[source][destination] = weight;
        if (!directed) matrix[destination][source] = weight; // For undirected graph
    }

    public void removeEdge(int source, int destination) {
        matrix[source][destination] = 0;
        if (!directed) matrix[destination][source] = 0; // For undirected graph
    }

    public boolean hasEdge(int source, int destination) {
        return matrix[source][destination] != 0;
    }

    public static boolean checkDirected( int[][] matrix ) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] != matrix[j][i])
                    return true; // Directed graph
            }
        }
        return false; // Undirected graph
    }

    public static void printMatrix( int[][] matrix ) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}