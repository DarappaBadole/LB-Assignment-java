/*
write a java program which accept two array from user and 
display content of each array


Input : 2  9  7  5  2  3
        9  3  5  5 

Output : 2  9  7  5  2  3
        9  3  5  5 

*/
import java.util.*;

class MyArray
{
    public void Display(int Arr1[],int Arr2[])
    {   Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements of first array:");
        for(int i=0;i<Arr1.length;i++)
        {
           Arr1[i] = sobj.nextInt();
        }

         System.out.println("Enter the elements of aecond array:");
        for(int j=0;j<Arr2.length;j++)
        {
           Arr2[j] = sobj.nextInt();
        }

        System.out.println("Elements of array1 are:");
        {
            for(int i=0;i<Arr1.length;i++)
        {
           System.out.print(Arr1[i]+"\t");
        }

        }
        System.out.println("");
         
         System.out.println("Elements of array2 are:");
        {
            for(int j=0;j<Arr2.length;j++)
        {
           System.out.print(Arr2[j]+"\t");
        }

        }


    }
}

class Program41_1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of first array:");
        int size1=sobj.nextInt();

        System.out.println("Enter the size of second array:");
        int size2=sobj.nextInt();

        int Arr1[] = new int[size1];
        int Arr2[] = new int[size2];

        MyArray obj = new MyArray();
        obj.Display(Arr1,Arr2);
        
        




    }
}
