import org.junit.Assert;
import org.junit.Test;

public class Solve_String_Anagram_Test {

    @Test
    public void test(){
        Solver_String_Anagram solver = new Solver_String_Anagram();
       // final int minimum_number_of_Deletions_1 =solver.getMinimumNumberOfDeletions("cde","bcf");
      //  Assert.assertEquals(minimum_number_of_Deletions_1,4);
      //  final int minimum_number_of_Deletions_2 =solver.getMinimumNumberOfDeletions("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke");
        //Assert.assertEquals(minimum_number_of_Deletions_2,30);
        numberNeeded("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke");
        System.out.println('a'-'a');
    }

    public static int numberNeeded(String first, String second) {
        int[] lettercounts = new int[26];
        for(char c : first.toCharArray()){
            lettercounts[c-'a']++;
        }
        for(char c : second.toCharArray()){
            lettercounts[c-'a']--;
        }
        int result = 0;
        for(int i : lettercounts){
            result += Math.abs(i);
        }
        return result;
    }

}
