import org.junit.Assert;
import org.junit.Test;

public class Solver_Luck_Balance_Greedy_Test {

    @Test
    public void test(){
        int [] luck_array_1 = {5,1,4};
        int [] imp_array_1 = {1,1,0};
        int numberOfImportantEventsToLoose =1;
        Solve_Luck_Balance_Greedy solve = new Solve_Luck_Balance_Greedy();
        Assert.assertEquals(solve.getMaximumAmountOfLuck(luck_array_1,imp_array_1,numberOfImportantEventsToLoose),8);
    }
}
