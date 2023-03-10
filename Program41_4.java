/*
write a java program which accept two array from user and 
display  odd content of each array


Input : 2  9  7  5  2  3
        45  6  12  18  23  4

Output : 9  5  3
         45  23

*/
import java.util.*;

class MyArray
{
    public void Display(int Arr1[],int Arr2[])
    {   Scanner sobj = new Scanner(System.in);
        int Arr3[] = new int[(Arr1.length+Arr2.length)];

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
         

         for(int i=0;i<Arr1.length;i++)
         {
            Arr3[i] = Arr1[i];
         }

         for(int i=0;i<Arr2.length;i++)
         {
            Arr3[Arr1.length+i] = Arr2[i];
         }

         for(int i=0;i<Arr3.length;i++)
         {
            System.out.print(Arr3[i]+"\t");
         }
       

    }
}

class Program41_3
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
