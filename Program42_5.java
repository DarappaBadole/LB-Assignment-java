/*
write a java program which accept  array from user and check whether
that array and its elements are pallindrome or not

Input : 11  252  387783  252  11
output :  TRUE

Input : 11  252  387783  77  11
Output :  FALSE

Input : 11  252  786  252  11
Output : FALSE

*/

import java.util.*;

class MyArray
{
    public boolean ChkPallindrome(int Arr[])
    {   Scanner sobj = new Scanner(System.in);
        int iStart =0;
        int iEnd=Arr.length-1;
        boolean bflag = true;

        System.out.println("Enter the elements of array:");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        while(iStart<iEnd)
        {
            if(Arr[iStart]!=Arr[iEnd])
            {
                bflag=false;

            }

            iStart++;
            iEnd--;

        }
        return bflag;
          

              
            

        
       

    }
}

class Program42_5
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of first array:");
        int size1=sobj.nextInt();

       

        int Arr[] = new int[size1];
        

        MyArray obj = new MyArray();
        boolean bRet = obj.ChkPallindrome(Arr);

        if(bRet==true)
        {
            System.out.println("TRUE");
        }

        else
        {
            System.out.println("FALSE");
        }

       
    
        
        




    }
}
