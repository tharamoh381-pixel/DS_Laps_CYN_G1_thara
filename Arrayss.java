package arrays;

import java.util.Scanner;

public class Arrayss {
        Scanner scanner = new Scanner(System.in);

    public void traversal(int []a) {
            System.out.println("The element are");;
            for (int i=0;i<a.length;i++)
                System.out.println("Index ["+i+"] = "+a[i]);

    }

    public void input(int []a){
       System.out.println("enter "+a.length+" element:");
                for (int i=0;i<a.length;i++)
                    a[i]=scanner.nextInt();



        }
}

