import org.junit.Assert;
import org.junit.Test;

public class Solver_Special_Palindromic_String_Test {

    @Test
    public void test(){
        Solve_Special_Palindromic_String solve = new Solve_Special_Palindromic_String();
      //  Assert.assertEquals(solve.checkIfStringIsPalindrome("non"),1);
       // Assert.assertEquals(solve.checkIfStringIsPalindrome("ono"),1);
        //Assert.assertEquals(solve.checkIfStringIsPalindrome("abcba"),0);

        //Assert.assertEquals(solve.getCountOfSpecialPalindromicString("aaaa"),10);
        Assert.assertEquals(solve.getCountOfSpecialPalindromicString("asasd"),7);
        Assert.assertEquals(solve.getCountOfSpecialPalindromicString("abcbaba"),10);
    }
}
