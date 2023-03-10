/*
write a java program which accept two array from user and 
display minimum of each array

Input:  2  9  7  5  2  3
        9  3  5  5 


Output : 2  3

*/

import java.util.*;

class MyArray
{
    public void MinArray(int Arr1[],int Arr2[])
    {   Scanner sobj = new Scanner(System.in);
        int iMin1=0;
        int iMin2=0;
        
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

        
          System.out.println("Smallest element in array1 is:");
          iMin1 = Arr1[0];
            for(int i=0;i<Arr1.length;i++)
           {  
            
            if(Arr1[i]<iMin1)
            {
                iMin1=Arr1[i];
            }

           
           }
           System.out.println(iMin1+"\t");

        
         System.out.println("");
         
         System.out.println("Smallest element in array2 is:");
           iMin2 = Arr2[0];
            for(int j=0;j<Arr2.length;j++)
            {   
                
            if(Arr2[j]<iMin2)
            {
                iMin2=Arr2[j];
            }

              
            }
             System.out.println(iMin2+"\t");

        
       

    }
}

class Program42_2
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
