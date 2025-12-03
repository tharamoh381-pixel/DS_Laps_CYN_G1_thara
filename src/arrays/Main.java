package arrays;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int []num1={1,2,3,4,5};
        //int []num2=new int[5];

//        System.out.printf(Arrays.toString(num2));

        Arrayss arr=new Arrayss();

        //arr.input(num2);

       // int result=arr.LinearSearch(num1,sv);

        arr.update(num1,3,7);
        arr.delete(num1,2);
        arr.shiftleft_Delete(num1, 2);


        arr.traversal(num1);

//        for (int number:num1)
//             System.out.println(number);
    }


}