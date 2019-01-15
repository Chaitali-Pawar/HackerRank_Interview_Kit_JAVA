import org.junit.Assert;
import org.junit.Test;

public class Solver_Minimum_Absolute_Difference_Test {

    @Test
    public void test(){
        int [] input_array_1 ={3 ,-7, 0};
        int [] input_array_2 ={-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        int [] input_array_3 = {1 ,-3, 71, 68, 17};
        Solve_Minimum_Absolute_Difference_Greedy solve = new Solve_Minimum_Absolute_Difference_Greedy();
        Assert.assertEquals(solve.getMinimumAbsoluteDifference(input_array_1),3);
        Assert.assertEquals(solve.getMinimumAbsoluteDifference(input_array_2),1);
        Assert.assertEquals(solve.getMinimumAbsoluteDifference(input_array_3),3);
    }
}
