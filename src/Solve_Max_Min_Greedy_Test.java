import org.junit.Assert;
import org.junit.Test;

public class Solve_Max_Min_Greedy_Test {

    @Test
    public void test(){
        Solve_Max_Min_Greedy solve = new Solve_Max_Min_Greedy();
        int [] input_array_1 ={1,4,7,2};
        int [] input_array_2 ={10,100,300,200,1000,20,30};
        int [] input_array_3 ={1,2, 3, 4, 10, 20, 30, 40, 100, 200};
        int [] input_array_4 = {4504, 1520,5857, 4094, 4157, 3902, 822, 6643, 2422, 7288, 8245, 9948, 2822, 1784, 7802, 3142, 9739, 5629, 5413, 7232};
        int [] input_array_5 ={100 ,200 ,300 ,350 ,400 ,401 ,402};
        int length_of_subArray_1 =2;
        int length_of_subarray_2 =3;
        int length_of_subarray_3 =4;
        int length_of_subarray_4 = 5;
        int length_of_subarray_5 =3;
       Assert.assertEquals(solve.getMinUnfairnessOfArray(input_array_1,length_of_subArray_1),1);
       Assert.assertEquals(solve.getMinUnfairnessOfArray(input_array_2,length_of_subarray_2),20);
       Assert.assertEquals(solve.getMinUnfairnessOfArray(input_array_3,length_of_subarray_3),3);
       Assert.assertEquals(solve.getMinUnfairnessOfArray(input_array_4,length_of_subarray_4) ,1335);
       Assert.assertEquals(solve.getMinUnfairnessOfArray(input_array_5,length_of_subarray_5) ,2);


    }
}
