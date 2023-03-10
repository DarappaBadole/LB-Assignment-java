/*
write a java program which accept  array of characers from user and count number 
of capital characters

Input : b  N  j  B  R  b  A  d  G  G
output :  6


*/

import java.util.*;

class MyArray
{
    public int ArrayCapital(String str)
    {   
        char Arr[] = str.toCharArray();
        int iCount=0;
        Scanner sobj = new Scanner(System.in);

        
        for(int i=0;i<Arr.length;i++)
        {
            if((Arr[i]>='A')&&(Arr[i]<='Z'))
            {
               iCount++;
            }
        }
        return iCount;
        

        
          

              
            

        
       

    }
}

class Program43_4
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the array of characters:");
        String str =sobj.nextLine();



        

        MyArray obj = new MyArray();
        int iRet =  obj.ArrayCapital(str);
        System.out.println(iRet+"\t");

       

       
    
        
        




    }
}
