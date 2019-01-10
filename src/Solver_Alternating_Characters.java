import java.util.Scanner;

public class Solver_Alternating_Characters {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        final int noOfTestCases = scanner.nextInt();
        SolveAlternatingCharacters solver = new SolveAlternatingCharacters();
        for(int i=0;i<noOfTestCases;i++){
            result.append(solver.getNumberOfDeletions(scanner.next())+"\n");
        }
        System.out.println(result);
    }
}

class SolveAlternatingCharacters{

    public int getNumberOfDeletions(String input){
        char []inputArray = input.toCharArray();
        int numberOfDeletions =0;
        for(int i=0;i<input.length() -1 ;i++){
            if(inputArray[i] == inputArray[i+1]){
                numberOfDeletions++;
            }
        }
        return numberOfDeletions;
    }
}
