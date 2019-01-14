import org.junit.Assert;
import org.junit.Test;

public class Solver_Minimum_Swaps_Array_Test {

    @Test
    public void test(){
        int input_Array_1 [] ={4,3,1,2};
        int input_Array_2 [] ={2, 3, 4, 1, 5};
        int input_Array_3 [] ={1, 3, 5, 2, 4, 6, 7};

        Solve_Minimum_Swaps solve = new Solve_Minimum_Swaps();
        Assert.assertEquals(solve.getMinimumNumberOfSwaps(input_Array_1) ,3);
        Assert.assertEquals(solve.getMinimumNumberOfSwaps(input_Array_2) ,3);
        Assert.assertEquals(solve.getMinimumNumberOfSwaps(input_Array_3) ,3);

    }

}
