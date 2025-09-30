package graph;

public class AdjacencyList {

    public EdgeNode[] adjacencyList; // array of linked lists for adjacency list representation

    // Constructor to initialize the graph with a given number of vertices
    public AdjacencyList(int vertices) {
        adjacencyList = new EdgeNode[vertices];
    }

    // Constructor to initialize the Adjacency List graph from a given Adjacency Matrix
    public AdjacencyList(int[][] matrix) {
        
        this.adjacencyList = new EdgeNode[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != 0) {
                    addEdge(i, j, matrix[i][j]);
                }
            }
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int s, int d, int w) {
        if (this.hasEdge(s, d)) {
            // If edge exists, just update the weight
            EdgeNode n = this.adjacencyList[s];
            while (n != null) {
                if (n.toV == d) {
                    n.weight = w; // Update the weight of the edge
                    return;
                }
                n = n.nextEdge;
            }
        } else {
            EdgeNode newEdge = new EdgeNode(s, d, w);
            // If the adjacency list for the source vertex is null, create a new linked list
            if (this.adjacencyList[s] == null) {
                this.adjacencyList[s] = newEdge;//here the newEdge is the head of the linked list
            } else {
                // Otherwise, append the new edge to the existing linked list
                appendLL(this.adjacencyList[s], newEdge);
            }
        }
    }

    public boolean hasEdge(int s, int d) {
        EdgeNode n = this.adjacencyList[s];
        while (n != null) {
            if (n.toV == d) return true; // Edge exists
            n = n.nextEdge;
        }
        return false; // Edge does not exist
    }

    // Method to remove an edge from the graph
    public int getWeight(int s, int d) {
        EdgeNode n = this.adjacencyList[s];
        while (n != null) {
            if (n.toV == d) return n.weight; // Return the weight of the edge
            n = n.nextEdge;
        }
        return -1; // Edge does not exist
    }

    // Method to show Adjacency List
    public void showAdjList() {
        for (int i = 0; i < this.adjacencyList.length; i++) {
            System.out.print("Vertex " + i + ": ");
            this.printLL(adjacencyList[i]);
        }
    }

    // Method to print the linked list
    private void printLL(EdgeNode head) {
        EdgeNode n = head;
        while (n != null) {
            System.out.print("<" + n.fromV + "-" + n.toV + ":" + n.weight + "> , ");
            n = n.nextEdge;
        }
        System.out.println();
    }

    // Method to append a node to the linked list
    public static void appendLL(EdgeNode head, EdgeNode eNode) {
        EdgeNode n = head;
        // Traverse to the last node
        while (n.nextEdge != null) {
            n = n.nextEdge;
        }
        // Connect the last node to the new node
        n.nextEdge = eNode;
    }

    // Method to calculate the length of the linked list
    public static int length(EdgeNode head) {
        EdgeNode n = head;
        int count = 0;
        while (n != null) {
            n = n.nextEdge;
            count++;
        }
        return count;
    }

    //instance method to find maximum weight in the adjacency list
    public EdgeNode maxWeightEdge() {
        EdgeNode maxEdgeNode = null;
        int maxWeight = Integer.MIN_VALUE;
        for (int i = 0; i < this.adjacencyList.length; i++) {
            EdgeNode n = this.adjacencyList[i];
            while (n != null) {
                if (n.weight > maxWeight) {
                    maxWeight = n.weight;
                    maxEdgeNode = n; // Store the edge with maximum weight
                }
                n = n.nextEdge;
            }
        }
        return maxEdgeNode;
    }
}
