import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solver_BFS_Search {

    public static void main(String args[]){
        InputReader ir = new InputReader(System.in);
        StringBuilder result = new StringBuilder();
        final int noOfTestCases = ir.readInt();
        for(int i=0;i<noOfTestCases;i++){
            final int noOFVertices = ir.readInt();
            final int noOfEdges = ir.readInt();
            Graph g = new Graph(noOFVertices);
            for(int j=0;j<noOfEdges;j++){
                g.addEdge(g,ir.readInt() -1 , ir.readInt() -1);
            }
            final int start_vertex = ir.readInt();
            Solve_BFS_Search solve = new Solve_BFS_Search();
            int [] distanceArray = solve.findTheShortestPathToSource(g,start_vertex-1,noOFVertices);
            for(int j=0;j<distanceArray.length;j++){
                if(j !=start_vertex -1){
                    result.append(distanceArray[j]+" ");
                }
            }
            result.append("\n");
        }
        System.out.println(result.toString());
    }

}

class Solve_BFS_Search{

    public int[] findTheShortestPathToSource(Graph g , int sourceVertex ,int numberOfVertices){

        // a queue to maintain the list of vertices to be visited in order
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean visited[] = new boolean[numberOfVertices];
        int distance [] = new int[numberOfVertices];

        // initialize the visited array
        Arrays.fill(distance,-1);
        Arrays.fill(visited,false);
        // initialze the visited of the source vertex to be true and distance from itself to be 0
        visited[sourceVertex] = true;
        distance[sourceVertex]=0;
        queue.add(sourceVertex);
        while(!queue.isEmpty()){
            int currentVertex = ((LinkedList<Integer>) queue).poll();
            ((LinkedList<Integer>) queue).removeFirst();
            for(int i=0;i<g.adjListArray.get(currentVertex).size();i++){
                if(visited[g.adjListArray.get(currentVertex).get(i)] == false){
                    // add to queue
                    queue.add(g.adjListArray.get(currentVertex).get(i)) ;
                    distance[g.adjListArray.get(currentVertex).get(i)] = distance[currentVertex] +6;
                    visited[g.adjListArray.get(currentVertex).get(i)] =true;
                }
            }

        }
        return distance;
    }
}