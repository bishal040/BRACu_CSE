public class Graph{
    int vertex;
    int[][] graph;
    Edge[] adjList;
    public Graph(int vertex){
        this.vertex = vertex;
        graph = new int[vertex][vertex];
        adjList = new Edge[vertex];
    }
    //directed_add_node method for Adjacency Matrix
    public void directed_add_node_matrix(int row, int col, int weight){
        graph[row][col] = weight;
    }
    //unDirected_add_node method for Adjacency Matrix
    public void unDirected_add_node_matrix(int row, int col, int weight){
        graph[row][col] = weight;
        graph[col][row] = weight;
    }
    //directed_add_node method for Adjacency List
    public void directed_add_node_list(int from, int to, int weight){
        Edge newEd = new Edge(from, to, weight);
        if(adjList[from]==null){
            adjList[from] = newEd;
        }
        else{
            Edge temp = adjList[from];
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newEd;
        }
    }
    //unDirected_add_node method for Adjacency List
    public void unDirected_add_node_list(int from, int to, int weight){
        if(!edgeExists(this.adjList[from], to, weight)){
            directed_add_node_list(from, to, weight);
        }
        if(!edgeExists(this.adjList[to], from, weight)){
            directed_add_node_list(to, from, weight);
        }
    }
    //Print 2D Array
    public static void print2DArray(int[][] arr2D){
        for(int[] arr: arr2D){
            System.out.print("[ ");
            for(int value: arr){
                System.out.print(value + " ");
            }
            System.out.println("]");
        }
    }
    //For printing List
    public static void printList(Edge[] ed){
        for(int i=0; i< ed.length; i++){
            Edge temp = ed[i];
            System.out.print("Vertex: " + i + " -->");
            while(temp!=null){
                System.out.print(" " + temp.to + "(" + temp.weight + ")");
                temp = temp.next;
            }
            System.out.println("");
        }
    }
    //Find Max Degree
    public int findMaxDegree(int[][] graph){
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int[] arr: graph){
            for(int value: arr){
                if(value != 0){
                    count++;
                }
            }
            if(max < count){
                max = count;
            }
            count = 0;
        }
        return max;
    }
    //For Finding Degree with Adjacency List
    public int findMaxDegreeList(Edge[] ed){
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<ed.length; i++){
            Edge temp = ed[i];
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            if(max<count){
                max = count;
            }
            count = 0;
        }
        return max;
    }
    //finding maxedge using matrix
    public int maxEdge(int[][] graph){
        int sum = 0, max = Integer.MIN_VALUE, maxVertex = -1;
        for(int i=0; i<graph.length;i++){
            for(int j=0; j< graph[0].length;j++){
                if(graph[i][j] != 0){
                    sum+=graph[i][j];
                }
            }
            if(max<sum){
                max = sum;
                maxVertex = i;
            }
            sum = 0;
        }
        return maxVertex;
    }
    //finding maxEdge using List
    public int maxEdge(Edge[] ed){
        int sum = 0, max = Integer.MIN_VALUE, maxVertexIndex = -1;
        for(int i=0; i<ed.length; i++){
            Edge temp = ed[i];
            while(temp!=null){
                sum+= temp.weight;
                temp = temp.next;
            }
            if(max<sum){
                max = sum;
                maxVertexIndex = i;
            }
            sum = 0;
        }
        return maxVertexIndex;
    }
    //directed adjacency Graph to undirected adjacency Graph
    public Graph directToUndirectMatrix(Graph g){
        Graph undirected = new Graph(g.vertex);
        for(int i=0; i<g.graph.length; i++){
            for(int j=0; j<g.graph.length; j++){
                if(g.graph[i][j]!=0){
                    int maxWeight = Math.max(g.graph[i][j], g.graph[j][i]);
                    undirected.unDirected_add_node_matrix(i, j, maxWeight);
                }
            }
        }
        return undirected;
    }
    //directed adjacency List to undirected adjacency List
    public Graph directToUndirectList(Graph g){
        Graph unDirected = new Graph(g.vertex);
        for(int i=0; i<g.adjList.length; i++){
            Edge temp = g.adjList[i];
            while(temp != null){
                unDirected.unDirected_add_node_list(temp.from,temp.to, temp.weight);
                temp = temp.next;
            }
        }
        return unDirected;
    }
    //check for dublicates
    public boolean edgeExists(Edge head, int to, int weight) {
        while (head != null) {
            if (head.to == to && head.weight == weight) return true;
            head = head.next;
        }
    return false;
    }
}