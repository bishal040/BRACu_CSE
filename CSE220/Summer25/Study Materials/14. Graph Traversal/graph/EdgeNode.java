package graph;

public class EdgeNode {

    public int fromV;
    public int toV;
    public int weight;
    public EdgeNode nextEdge;

    public EdgeNode(int fromV, int toV, int weight) {
        this.fromV = fromV;
        this.toV = toV;
        this.weight = weight;
        this.nextEdge = null;
    }



}
