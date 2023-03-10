/*
write a java program which accept  array from user and reverse each number
of that array

Input : 89  687  56  549  87  9
output :  98  786  65  945  78  9


*/

import java.util.*;

class MyArray
{
    public void ReverseArray(int Arr[])
    {   Scanner sobj = new Scanner(System.in);
        int iDigit =0;
       
        System.out.println("Enter the elements of array:");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        for(int i=0;i<Arr.length;i++)
        {
            while(Arr[i]!=0)
            {
                iDigit = Arr[i] % 10;
                Arr[i] = Arr[i] /10;

                System.out.print(iDigit);
            }
            System.out.print("\t");
        }
          

              
            

        
       

    }
}

class Program43_1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of first array:");
        int size1=sobj.nextInt();

       

        int Arr[] = new int[size1];
        

        MyArray obj = new MyArray();
         obj.ReverseArray(Arr);

       

       
    
        
        




    }
}
