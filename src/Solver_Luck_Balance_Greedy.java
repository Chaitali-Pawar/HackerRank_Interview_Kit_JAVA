import java.util.Arrays;

public class Solver_Luck_Balance_Greedy {
}


class Solve_Luck_Balance_Greedy{

    public int getMaximumAmountOfLuck(int luckArray[],int importanceArray[] ,int numberOfImportantEventsToLoose){
        int maximumAmountOfLuck =0;
        int numberOfImportantContest =0;
        // find the number of contests that are important

        for(int i=0;i<importanceArray.length;i++){
            if(importanceArray[i] ==1 ){
                numberOfImportantContest++;
            }
        }

        if(numberOfImportantContest == numberOfImportantEventsToLoose){
            // maximum luck
            for(int i=0;i<luckArray.length;i++){
                maximumAmountOfLuck += luckArray[i];

            }
            return maximumAmountOfLuck;
        }

        else{
            // find the number of contest that L needs to win
            int numberOfContestToWin = numberOfImportantContest -numberOfImportantEventsToLoose;
            Arrays.sort(luckArray);
            int subtractLuck =0;
            for(int i=0;i<numberOfContestToWin;i++){
                subtractLuck +=luckArray[i];
            }
            for(int i=numberOfContestToWin;i<luckArray.length;i++){
                maximumAmountOfLuck+=luckArray[i];
            }
            return maximumAmountOfLuck - subtractLuck;
        }

    }
}