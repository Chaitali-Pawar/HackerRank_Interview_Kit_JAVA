import org.junit.Assert;
import org.junit.Test;

public class Solver_Sherlock_Valid_String_Test {

    @Test
    public void test(){
        Solve_Sherlock_Valid_String solve = new Solve_Sherlock_Valid_String();
       // System.out.println('a'-'c');
        Assert.assertEquals(solve.findIfStringIsValid("abcdefghhgfedecba"),"YES");
        Assert.assertEquals(solve.findIfStringIsValid("aabbccddeefghi"),"NO");
        Assert.assertEquals(solve.findIfStringIsValid("aabbc"),"YES");
        Assert.assertEquals(solve.findIfStringIsValid("aabbcd"),"NO");
    }
}
