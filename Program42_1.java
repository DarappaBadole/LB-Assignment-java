/*
write a java program which accept two array from user and return difference between 
summation of arrays

Input:  2  9  7  5  2  3
        9  3  5  5 


Output : 6

*/

import java.util.*;

class MyArray
{
    public int DiffArray(int Arr1[],int Arr2[])
    {   Scanner sobj = new Scanner(System.in);
        int iSum1=0;
        int iSum2=0;
        
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

        
        {
            for(int i=0;i<Arr1.length;i++)
        {  

          
          iSum1=iSum1+Arr1[i];

           
        }

        }
        System.out.println("");
         
         
        
            for(int j=0;j<Arr2.length;j++)
            {   
              iSum2 = iSum2+Arr2[j];
            }

        
        return iSum1-iSum2;

    }
}

class Program42_1
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
        int iRet= obj.DiffArray(Arr1,Arr2);

        System.out.println(iRet+"\t");

    
        
        




    }
}
