import java.util.Scanner;

public class Solve_String_Anagram {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        Solver_String_Anagram solver = new Solver_String_Anagram();
        String inputString_1 = scanner.next();
        String inputString_2 = scanner.next();
        System.out.println(solver.getMinimumNumberOfDeletions(inputString_1,inputString_2));
    }
}

class Solver_String_Anagram{

    public static int getMinimumNumberOfDeletions(String first, String second) {
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
