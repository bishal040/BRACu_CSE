public class Tester {
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static void colorPrint(String str){
        System.out.println(GREEN + str + RESET);
    }
    public static void main(String[] args) {
    //Undirect Adjacency Matrix
    Graph unDirectGraph = new Graph(8);
    // Add Node For Undirected Adjacency Matrix
    unDirectGraph.unDirected_add_node_matrix(1, 5, 4);
    unDirectGraph.unDirected_add_node_matrix(1, 4, 3);
    unDirectGraph.unDirected_add_node_matrix(5, 7, 1);
    unDirectGraph.unDirected_add_node_matrix(2, 3, 5);
    unDirectGraph.unDirected_add_node_matrix(3, 5, 2);
    unDirectGraph.unDirected_add_node_matrix(4, 3, 5);
    unDirectGraph.unDirected_add_node_matrix(6, 1, 3);
    unDirectGraph.unDirected_add_node_matrix(2, 4, 1);
    unDirectGraph.unDirected_add_node_matrix(0, 4, 3);
    // Add Node For UnDirected Adjacency List
    unDirectGraph.unDirected_add_node_list(1, 5, 4);
    unDirectGraph.unDirected_add_node_list(1, 4, 3);
    unDirectGraph.unDirected_add_node_list(5, 7, 1);
    unDirectGraph.unDirected_add_node_list(2, 3, 5);
    unDirectGraph.unDirected_add_node_list(3, 5, 2);
    unDirectGraph.unDirected_add_node_list(4, 3, 5);
    unDirectGraph.unDirected_add_node_list(6, 1, 3);
    unDirectGraph.unDirected_add_node_list(2, 4, 1);
    unDirectGraph.unDirected_add_node_list(0, 4, 3);
    //Direct Graph For Adjacency Matrix
    Graph directGraph = new Graph(8);
    //Add Node for Directed Adjacency Matrix
    directGraph.directed_add_node_matrix(1,5,3);
    directGraph.directed_add_node_matrix(1,4,2);
    directGraph.directed_add_node_matrix(3,2,4);
    directGraph.directed_add_node_matrix(4,3,7);
    directGraph.directed_add_node_matrix(6,7,8);
    directGraph.directed_add_node_matrix(7,5,2);
    directGraph.directed_add_node_matrix(1,6,7);
    directGraph.directed_add_node_matrix(5,2,8);
    directGraph.directed_add_node_matrix(1,3,3);
    directGraph.directed_add_node_matrix(3,5,4);
    directGraph.directed_add_node_matrix(2,7,5);
    directGraph.directed_add_node_matrix(4,7,4);
    directGraph.directed_add_node_matrix(0,7,3);
    directGraph.directed_add_node_matrix(4,6,3);
    directGraph.directed_add_node_matrix(5,0,7);
    directGraph.directed_add_node_matrix(2,0,4);
    //Add Node For Direct Adjacency List
    directGraph.directed_add_node_list(1,5,3);
    directGraph.directed_add_node_list(1,4,2);
    directGraph.directed_add_node_list(3,2,4);
    directGraph.directed_add_node_list(4,3,7);
    directGraph.directed_add_node_list(6,7,8);
    directGraph.directed_add_node_list(7,5,2);
    directGraph.directed_add_node_list(1,6,7);
    directGraph.directed_add_node_list(5,2,8);
    directGraph.directed_add_node_list(1,3,3);
    directGraph.directed_add_node_list(3,5,4);
    directGraph.directed_add_node_list(2,7,5);
    directGraph.directed_add_node_list(4,7,4);
    directGraph.directed_add_node_list(0,7,3);
    directGraph.directed_add_node_list(4,6,3);
    directGraph.directed_add_node_list(5,0,7);
    directGraph.directed_add_node_list(2,0,4);
    //Lab Task0A Demostration using Adjacency Matrix
    colorPrint("<---------------Task0A--------------->");
    System.out.println("<-----UnDirectedGraph Matrix Simulation----->");
    Graph.print2DArray(unDirectGraph.graph);
    //Lab Task1A Demostration using Adjacency Matrix
    colorPrint("<---------------Task1A--------------->");
    int maxDegree = unDirectGraph.findMaxDegree(unDirectGraph.graph);
    System.out.println("Max degree of the Vertex: " + maxDegree);
    //Lab Task2A Demostration using Adjacency Matrix
    colorPrint("<---------------Task2A--------------->");
    int maxVertex= unDirectGraph.maxEdge(unDirectGraph.graph);
    System.out.println("The Vertex: " + maxVertex + " has max sum of edge.");
    System.out.println("Using Adjacency List:");
    //Lab Task0B Demostration using Adjacency List
    colorPrint("<---------------Task0B--------------->");
    System.out.println("<-----unDirectedGraph List Simulation----->");
    Graph.printList(unDirectGraph.adjList);
    //Lab Task1B Demostration using Adjacency List
    colorPrint("<---------------Task1B--------------->");
    int maxDegreeList = unDirectGraph.findMaxDegreeList(unDirectGraph.adjList);
    System.out.println("Max Degree of the Vertex: " + maxDegreeList);
    //Lab Task2B Demostration using Adjacency List
    colorPrint("<---------------Task2B--------------->");
    int maxVertexList= unDirectGraph.maxEdge(unDirectGraph.adjList);
    System.out.println("The Vertex: " + maxVertexList + " has max sum of edge.");
    //Lab Task3A1 Demostration using Adjacency Matrix
    colorPrint("<---------------Task3A1--------------->");
    int max_Degree = directGraph.findMaxDegree(directGraph.graph);
    System.out.println("Max degree of the Vertex: " + max_Degree);
    //Lab Task3A2 Demostration using Adjacency Matrix
    colorPrint("<---------------Task3A2--------------->");
    int max_Vertex= directGraph.maxEdge(directGraph.graph);
    System.out.println("The Vertex: " + max_Vertex + " has max sum of edge.");
    //Lab Task3B1 Demostration using Adjacency List
    colorPrint("<---------------Task3B1--------------->");
    int max_DegreeList = directGraph.findMaxDegreeList(directGraph.adjList);
    System.out.println("Max Degree of the Vertex: " + max_DegreeList);
    //Lab Task3B2 Demostration using Adjacency List
    colorPrint("<---------------Task3B2--------------->");
    int max_VertexList= directGraph.maxEdge(directGraph.adjList);
    System.out.println("The Vertex: " + max_VertexList + " has max sum of edge.");
    //Lab Task4A Demostration using Adjacency Matrix
    colorPrint("<---------------Task4A--------------->");
    System.out.println("<-----DirectedGraph Matrix Simulation before convertion----->");
    Graph.print2DArray(directGraph.graph);
    Graph converted_graph_matrix =directGraph.directToUndirectMatrix(directGraph);
    System.out.println("<-----UnDirectedGraph Matrix Simulation after convertion----->");
    Graph.print2DArray(converted_graph_matrix.graph);
    //Lab Task4B Demostration using Adjacency List
    colorPrint("<---------------Task4B--------------->");
    System.out.println("<-----DirectedGraph List Simulation before convertion----->");
    Graph.printList(directGraph.adjList);
    Graph converted_graph_list = directGraph.directToUndirectList(directGraph);
    System.out.println("<-----unDirectedGraph List Simulation after convertion----->");
    Graph.printList(converted_graph_list.adjList);
    System.out.println("\u001B[32m\n<=============== Assignment Completed ===============>\u001B[0m");
}
}
