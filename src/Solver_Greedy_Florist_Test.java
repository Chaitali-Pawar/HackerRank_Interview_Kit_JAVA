import org.junit.Assert;
import org.junit.Test;

public class Solver_Greedy_Florist_Test {

    @Test
    public void test(){
        Solve_Greedy_Florist solve = new Solve_Greedy_Florist();
        int input_array_1 [] = {1,2,3,4};
        int input_array_2 [] = {1 ,12, 5 ,111, 200, 1000, 10};
        int max_amount_1 =7;
        int max_amount_2 =50;
        Assert.assertEquals(solve.getMaximumNumberOfToys(input_array_1,max_amount_1),3);
        Assert.assertEquals(solve.getMaximumNumberOfToys(input_array_2,max_amount_2),4);
    }
}
