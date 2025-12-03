package arrays;

import com.sun.org.apache.xpath.internal.objects.XNumber;

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

        public void update(int[] a, int index, int nvalue){
            if (index<0 || index>=a.length)
                System.out.println("index not found");
            else
                a[index]=nvalue;

        }

    public void delete(int[] a, int index){
        if (index<0 || index>=a.length)
            System.out.println("index not found");
        else
            a[index]=0;

    }

    public void shiftleft_Delete(int[]a,int index){
        for (int i=index; i<a.length-1;i++)
            a[i]=a[i+1];

        a[a.length-1]=Integer.MIN_VALUE;
    }

    public void shiftRight_Delete(int[] a, int index) {
        for (int i = index; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = Integer.MIN_VALUE;
    }

    public int LinearSearch (int[] a,int svalue){
      for (int i=0;i<a.length;i++)
          {
          if (svalue==a[i])
              return i;
          }

    return-1;}
  }

