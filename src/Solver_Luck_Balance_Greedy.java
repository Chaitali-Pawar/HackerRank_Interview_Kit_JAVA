import java.util.Arrays;

public class Solver_Luck_Balance_Greedy {

    public static void main(String args[]){
        InputReader ir = new InputReader(System.in);
        final int numberOfEvents =ir.readInt();
        final int numberOfImportantEventsToLoose = ir.readInt();
        int [] luckArray = new int[numberOfEvents];
        int [] importanceArray = new int[numberOfEvents];
        for(int i=0;i<numberOfEvents;i++){
            luckArray[i] = ir.readInt();
            importanceArray[i] =ir.readInt();
        }
        Solve_Luck_Balance_Greedy solve = new Solve_Luck_Balance_Greedy();
        System.out.println(solve.getMaximumAmountOfLuck(luckArray,importanceArray,numberOfImportantEventsToLoose));
    }
}


class Solve_Luck_Balance_Greedy{

    public int getMaximumAmountOfLuck(int luckArray[],int importanceArray[] ,int numberOfImportantEventsToLoose){

        int numberOfImportantContest =0;
        int total_luck =0;

        // find the number of contests that are important

        for(int i=0;i<importanceArray.length;i++){
            if(importanceArray[i] ==1 ){
                numberOfImportantContest++;
            }
        }
        for(int i=0;i<luckArray.length;i++){
            total_luck += luckArray[i];
        }

        int [] importantEventsArray =  new int[numberOfImportantContest];
        int j=0;
        for(int i=0;i<luckArray.length;i++){
            if(importanceArray[i]==1){
                importantEventsArray[j] = luckArray[i];
                j++;
            }
        }
            // find the number of contest that L needs to win
            int numberOfContestToWin = numberOfImportantContest -numberOfImportantEventsToLoose;
            Arrays.sort(importantEventsArray);
            int subtractLuck =0;
            for(int i=0;i<numberOfContestToWin;i++){
                subtractLuck +=importantEventsArray[i];
            }
            return total_luck - 2*subtractLuck;


    }
}