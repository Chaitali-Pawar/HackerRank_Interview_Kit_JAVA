import org.junit.Assert;
import org.junit.Test;

public class Solver_Luck_Balance_Greedy_Test {

    @Test
    public void test(){
        int [] luck_array_1 = {5,1,4};
        int [] luck_array_2 = {5,2,1,8,10,5};
        int [] luck_array_3 = {3,13,21,31,17,20,8,12,14,21};
        int [] luck_array_4 = {5,1,4};
        int [] imp_array_1 = {1,1,0};
        int [] imp_array_2={1,1,1,1,0,0};
        int [] imp_array_3 = {1,1,1,1,1,1,1,0,0,1};
        int [] imp_array_4 = {1,1,1};
        int numberOfImportantEventsToLoose_1=1;
        int numberOfImportantEventsToLoose_2=3;
        int numberOfImportantEventsToLoose_3=3;
        int numberOfImportantEventsToLoose_4=3;
        Solve_Luck_Balance_Greedy solve = new Solve_Luck_Balance_Greedy();
       Assert.assertEquals(solve.getMaximumAmountOfLuck(luck_array_1,imp_array_1,numberOfImportantEventsToLoose_1),8);
        Assert.assertEquals(solve.getMaximumAmountOfLuck(luck_array_2,imp_array_2,numberOfImportantEventsToLoose_2),29);
       Assert.assertEquals(solve.getMaximumAmountOfLuck(luck_array_3,imp_array_3,numberOfImportantEventsToLoose_3),38);
        Assert.assertEquals(solve.getMaximumAmountOfLuck(luck_array_4,imp_array_4,numberOfImportantEventsToLoose_4),10);

    }
}
