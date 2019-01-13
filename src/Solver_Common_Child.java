import java.util.Scanner;

public class Solver_Common_Child {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String input_1 = scanner.next();
        String input_2 = scanner.next();
        Solve_Common_Child solve =  new Solve_Common_Child();
        System.out.println(solve.getLengthOfCommonSubsequence(input_1,input_2));
    }
}

class Solve_Common_Child{

    public int getLengthOfCommonSubsequence(String x, String y){
        int length_x = x.length();
        int length_y = y.length();
        int [][]lengthOfSubsequence = new int[length_x+1][length_y+1];
        char [] x_array = x.toCharArray();
        char [] y_array = y.toCharArray();
        for(int i=0;i<=length_x;i++){
            for(int j=0;j<=length_y;j++){
                if(i ==0 || j==0){
                    lengthOfSubsequence[i][j] =0;
                }
                else if(x_array[i-1] == y_array[j-1]){
                    lengthOfSubsequence[i][j] =lengthOfSubsequence[i-1][j-1]+1;
                }
                else{
                    lengthOfSubsequence[i][j] = Math.max(lengthOfSubsequence[i-1][j],lengthOfSubsequence[i][j-1]);
                }
            }
        }
        return lengthOfSubsequence[length_x][length_y] ;

    }
}
