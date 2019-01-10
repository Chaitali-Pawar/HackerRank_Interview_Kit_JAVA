import org.junit.Assert;
import org.junit.Test;

public class Solver_Alternating_Characters_Test {

    @Test
    public void test(){
        SolveAlternatingCharacters solver = new SolveAlternatingCharacters();
        Assert.assertEquals(solver.getNumberOfDeletions("AABAAB"),2);
        Assert.assertEquals(solver.getNumberOfDeletions("AAAA"),3);
        Assert.assertEquals(solver.getNumberOfDeletions("BBBBB"),4);
    }
}
