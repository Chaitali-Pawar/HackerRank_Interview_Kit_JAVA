import org.junit.Test;

public class Solver_BFS_Search_Test {

    @Test
    public void test(){
        Graph g = new Graph(4);
        g.addEdge(g,0,1);
        g.addEdge(g,0,2);
        Solve_BFS_Search solve = new Solve_BFS_Search();
        solve.findTheShortestPathToSource(g,0,4);

    }
}
