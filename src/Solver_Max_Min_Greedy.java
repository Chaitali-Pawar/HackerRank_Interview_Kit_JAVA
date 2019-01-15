import java.util.Arrays;

public class Solver_Max_Min_Greedy {
    public static void main(String args[]){
        Solve_Max_Min_Greedy solve = new Solve_Max_Min_Greedy();
        InputReader ir = new InputReader(System.in);
        final int length_Of_Input_Array = ir.readInt();
        final int length_Of_Sub_Array = ir.readInt();
        int [] inputArray = new int[length_Of_Input_Array];
        for(int i=0;i<length_Of_Input_Array;i++){
            inputArray[i] = ir.readInt();
        }
        System.out.println(solve.getMinUnfairnessOfArray(inputArray,length_Of_Sub_Array));
    }
}

class Solve_Max_Min_Greedy{

    public int getMinUnfairnessOfArray(int inputArray[] , int lengthOfSubArray){
        Arrays.sort(inputArray);
        int  minimumUnfairness = inputArray[lengthOfSubArray -1 ] - inputArray[0];
        for(int i=0;i<inputArray.length;i++){
            if(i+lengthOfSubArray > inputArray .length)
                break;
            // greedy calculation
            if(minimumUnfairness > inputArray[i+lengthOfSubArray -1] - inputArray[i] ){
                minimumUnfairness = inputArray[i+lengthOfSubArray -1] - inputArray[i];
            }
        }
        return  minimumUnfairness;
    }
}
