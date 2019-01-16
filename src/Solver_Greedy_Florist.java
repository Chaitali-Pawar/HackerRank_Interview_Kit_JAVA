import java.util.Arrays;

public class Solver_Greedy_Florist {

    public static void main(String args[]){
        InputReader ir = new InputReader(System.in);
        final int sizeOfInputArray = ir.readInt();
        final int maximumAmount = ir.readInt();
        int [] inputArray = new int [sizeOfInputArray];
        for(int i=0;i<sizeOfInputArray;i++){
            inputArray[i] = ir.readInt();
        }
        Solve_Greedy_Florist solve = new Solve_Greedy_Florist();
        System.out.println(solve.getMaximumNumberOfToys(inputArray,maximumAmount));
    }
}

class Solve_Greedy_Florist{

    public int getMaximumNumberOfToys(int [] inputArray , int maxAmount){
        // 1 2 3 4  k =7
        // sort the inputArray
        int maximumNumberOfToys =0;
        Arrays.sort(inputArray);
        int calculateAmount =inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(calculateAmount < maxAmount){
                calculateAmount+= inputArray[i];
                maximumNumberOfToys ++;
            }else{
                break;
            }
        }
        return maximumNumberOfToys;
    }
}
