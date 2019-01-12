import org.junit.Assert;
import org.junit.Test;

public class Solver_Common_Child_Test {

    @Test
    public void test(){
        Solve_Common_Child solve = new Solve_Common_Child();
        Assert.assertEquals(solve.getLengthOfCommonSubsequence("AA","BB"),0);
        Assert.assertEquals(solve.getLengthOfCommonSubsequence("SHINCHAN","NOHARAAA"),3);

    }
}
