/*
write a java program which accept two array from user and 
copy the contents of that array into another array 
and return new array 

*/

import java.util.*;

class MyArray
{
    public void MinArray(int Arr1[],int Arr2[])
    {   Scanner sobj = new Scanner(System.in);
        int iTemp1[] = new int[Arr1.length];
        int iTemp2[] = new int[Arr2.length];

        
        System.out.println("Enter the elements of first array:");
        for(int i=0;i<Arr1.length;i++)
        {
           Arr1[i] = sobj.nextInt();
           
        }

         System.out.println("Enter the elements of second array:");
        for(int j=0;j<Arr2.length;j++)
        {
           Arr2[j] = sobj.nextInt();
           
        }
        
        System.out.println("of first array is:");
        for(int i=0;i<Arr1.length;i++)
        {
            iTemp1[i] = Arr1[i];
            System.out.print(iTemp1[i]+"\t");

        }
        System.out.println("");
        
        System.out.println(" second array is:");
         for(int i=0;i<Arr2.length;i++)
        {
            iTemp2[i] = Arr2[i];
            System.out.print(iTemp2[i]+"\t");
            
        }

        
          

              
            

        
       

    }
}

class Program42_4
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
        obj.MinArray(Arr1,Arr2);

       
    
        
        




    }
}
