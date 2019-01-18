import java.util.LinkedList;

public class Graph {

    int numberOfVertices;
    LinkedList<LinkedList<Integer>> adjListArray;

    Graph(int numberOfVertices){
        this.numberOfVertices =numberOfVertices;
        adjListArray = new LinkedList();

        // for each list in the adj array which is the size of number of vertices create a list
        for(int i=0;i<numberOfVertices;i++){
            adjListArray.add(new LinkedList<>());
        }
    }

    public void addEdge(Graph g , int sourceVertex , int destinationVetex){
        // add edge in an undirected graph from source to destination as well as from destination to source
       g.adjListArray.get(sourceVertex).add(destinationVetex);
       g.adjListArray.get(destinationVetex).add(sourceVertex);
    }
}
