package arrays;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int []num1={1,2,3,4,5};
        //int []num2=new int[5];


//        System.out.printf(Arrays.toString(num2));
         int []numbers={2,3,4,5,6,7,};
         Arrays.sort(numbers);

        Arrayss arr=new Arrayss();
        arr.traversal(numbers);
        int result=arr.binarySearch(numbers, 5, 0, numbers.length-1);

        //arr.input(num2);


       // int result=arr.LinearSearch(num1,sv);
        if (result!=-1)
            System.out.println("value found at index:" +result);
        else
            System.out.println("value not found");

       // arr.update(num1,3,7);
      //  arr.delete(num1,2);
       // arr.shiftleft_Delete(num1, 2);


       // arr.traversal(num1);

//        for (int number:num1)
//             System.out.println(number);
    }


}