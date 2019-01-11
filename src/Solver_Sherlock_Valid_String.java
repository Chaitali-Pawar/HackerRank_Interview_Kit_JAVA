import java.util.Scanner;

public class Solver_Sherlock_Valid_String {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        final String input = scanner.next();
        Solve_Sherlock_Valid_String solve = new Solve_Sherlock_Valid_String();
        System.out.println(solve.findIfStringIsValid(input));
    }
}

class Solve_Sherlock_Valid_String{

    final String YES_CONSTANT ="YES";
    final String NO_CONSTANT ="NO";

    public String findIfStringIsValid(String input){

        char []inputArray = input.toCharArray();
        int[] frequencyArray = new int[26];
        for(int i=0;i<input.length();i++){
            frequencyArray[Math.abs('a'-inputArray[i])]++;
        }
        int singleOccurence =0;
        final int mode = mode(frequencyArray);
        for(int i=0;i<frequencyArray.length;i++){
            if(frequencyArray[i] !=mode && frequencyArray[i] !=0){
                // check if subtracting by 1 it turns to be one
                if(frequencyArray[i] -1 == mode || frequencyArray[i] == 1){
                    singleOccurence++;
                    if(singleOccurence >1){
                        return NO_CONSTANT;
                    }
                }
                else {
                    return NO_CONSTANT;
                }
            }
        }
        return YES_CONSTANT;

    }
    public  int mode(int[] array) {
        int mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == value && array[j] !=0) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        if (maxCount > 1) {
            return mode;
        }
        return 0;
    }
}
