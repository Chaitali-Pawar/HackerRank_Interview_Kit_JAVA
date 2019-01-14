import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solver_Minimum_Swaps_Array {

    public static void main(String args[]){
        Solve_Minimum_Swaps solve = new Solve_Minimum_Swaps();
        Scanner scannner = new Scanner(System.in);
        final int length_Of_Array = scannner.nextInt();
        final int [] input_array = new int [length_Of_Array];
        for(int i=0;i<length_Of_Array;i++){
            input_array[i] = scannner.nextInt();
        }
        System.out.println(solve.getMinimumNumberOfSwaps(input_array));
    }
}

class Solve_Minimum_Swaps{

    public int getMinimumNumberOfSwaps(int [] inputArray){
        int minimum_number_of_swaps = 0;
        int [] sorted_input_array = Arrays.copyOf(inputArray,inputArray.length);
        // sort the original array
        Arrays.sort(sorted_input_array);
        for(int i=0;i<inputArray.length;i++){
                if(inputArray[i] != sorted_input_array[i]){
                    // the elements are not sorted , swap the element
                    // find the element in unsorted array and swap it
                    // swap the input array elements
                    // get index
                    int index =0;
                    for(int j=0;j<inputArray.length;j++){
                        if(sorted_input_array[i] == inputArray[j]){
                            index = j;
                            break;
                        }
                    }

                    int temp = inputArray[i];
                    inputArray[i] = inputArray[index];
                    inputArray[index]= temp;
                    minimum_number_of_swaps ++;

                }
        }
        return  minimum_number_of_swaps;
    }

}
