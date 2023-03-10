/*
write a java program which accept array from user and display below 
pattern

Input : 8  9  7  6  4  2  4

Output :  *  *  *  *  *  *  *  *  *
          *  *  *  *  *  *
          *  *  *  * 
          *  *
          *  *  *  *
*/

import java.util.*;

class MyArray
{
    public void Pattern(int Arr[])
    {
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i]%2==0)
            {
                for(int j=0;j<Arr[i];j++)
                {
                    System.out.print("*"+"\t");
                }System.out.println("");
            }
        }

    }
}

class Program44_5
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size array:");
        int iSize  = sobj.nextInt();

        int Arr[] = new int [iSize];

        System.out.println("Enter the array of characters:");
        for(int i=0;i<iSize;i++)
        {
            Arr[i] = sobj.nextInt();
        }


        MyArray obj = new MyArray();

        obj.Pattern(Arr);




        
    }
}