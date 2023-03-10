/*
write a java program which accept  array from user and replace each member
with summation of its digits

Input : 89  687  56  549  87  9
output :  17  21  11  18  15  9


*/

import java.util.*;

class MyArray
{
    public void SumArray(int Arr[])
    {   Scanner sobj = new Scanner(System.in);
        int iDigit =0;
        int iSum=0;
       
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

                iSum = iSum+iDigit;
                Arr[i] = Arr[i] /10;

                
            }
            System.out.print(iSum);
            iSum=0;
            System.out.print("\t");
        }
          

              
            

        
       

    }
}

class Program43_2
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of first array:");
        int size1=sobj.nextInt();

       

        int Arr[] = new int[size1];
        

        MyArray obj = new MyArray();
         obj.SumArray(Arr);

       

       
    
        
        




    }
}
