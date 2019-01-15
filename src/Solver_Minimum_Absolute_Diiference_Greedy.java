import java.io.DataInputStream;
import java.util.Arrays;

public class Solver_Minimum_Absolute_Diiference_Greedy {

    public static void main(String args[]){
        InputReader ir = new InputReader(new DataInputStream(System.in));
        final int lengthOfInputArray = ir.readInt();
        int [] inputArray = new int[lengthOfInputArray];
        for(int i=0;i<lengthOfInputArray;i++){
            inputArray[i]= ir.readInt();
        }
        Solve_Minimum_Absolute_Difference_Greedy solve = new Solve_Minimum_Absolute_Difference_Greedy();
        System.out.println(solve.getMinimumAbsoluteDifference(inputArray));

    }
}

class Solve_Minimum_Absolute_Difference_Greedy{


    public int getMinimumAbsoluteDifference(int [] inputArray){
        // sort the array and then find the min abs difference between consective?
        Arrays.sort(inputArray);
        int minimum_absolute_difference =Math.abs(inputArray[0] - inputArray[1]);
        for(int i=0;i<inputArray.length -1;i++){
            if(Math.abs(inputArray[i] - inputArray[i+1]) <minimum_absolute_difference){
                minimum_absolute_difference = Math.abs(inputArray[i] - inputArray[i+1]);
            }
        }

        return minimum_absolute_difference;
    }
}