import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Solver_Special_Palindromic_String {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        final int length_Of_Input_String = scanner.nextInt();
        final String input_String = scanner.next();
        Solve_Special_Palindromic_String solve = new Solve_Special_Palindromic_String();
        System.out.println(solve.getCountOfSpecialPalindromicString(input_String));
    }
}

class Solve_Special_Palindromic_String {

    public long getCountOfSpecialPalindromicString(String input){
        long count_Of_Special_Palindromic_String =0;
        StringBuilder input_String_Builder = new StringBuilder(input);
        LinkedList<String> inputList = new LinkedList<String >();
        for(int i=0;i<input.length();i++){
            // find the single char elements as they form a palindrome as well
            inputList.add(input_String_Builder.charAt(i)+"");
            // check if a similar element exists extract it and check if the substring is a palindrome
            for(int j=i+1;j<input.length();j++){
                if(input_String_Builder.charAt(i) == input_String_Builder.charAt(j)){
                    // extract the substring check if it is a palindrome

                 if(checkIfStringIsPalindrome(input.substring(i,j+1)) == 1 ){
                    // count_Of_Special_Palindromic_String++;
                     inputList.add(input.substring(i,j+1)+"");
                 }
                }
            }
        }
        count_Of_Special_Palindromic_String = count_Of_Special_Palindromic_String + inputList.size();
        return count_Of_Special_Palindromic_String;
    }

    public int checkIfStringIsPalindrome(String inputPalindrome){

        char [] inputPalindromeArray = inputPalindrome.toCharArray();
        char first_Character = inputPalindromeArray[0];
        if(inputPalindrome.length() % 2 == 0 ){
            for(int i=0;i<inputPalindrome.length();i++){
                if(inputPalindromeArray[i] != first_Character){
                    return 0;
                }
            }
            return 1;
        }else{
            for(int i=0;i<inputPalindrome.length();i++){
                if(inputPalindromeArray[i] != first_Character && i!=(inputPalindrome.length()/2)){
                    return 0;
                }
            }
            return 1;
        }
    }
}
