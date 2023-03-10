/*
write a java program which accept N numberas from user and return 
product of all odd elements:

Inout : N : 6
        
        Elements  : 85  63  3 70  10  88
        Output : 45

*/
import java.util.*;

class Numbers
{
    public int iMult=1;
    

    public int Display(int Arr[])
    {
        
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i] %2!=0)
            {  
                iMult= iMult*Arr[i];
            }
        
        }return iMult;

    }
}

class Program34_5
{
    public static void main(String arr[])
    {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the size of the array:");
      int iSize = sobj.nextInt();

      int Arr[] = new int[iSize];

      System.out.println("Enter the elements of array:");

      for(int i = 0; i<Arr.length;i++)
      {
        Arr[i] = sobj.nextInt();
      }

      Numbers obj  = new Numbers();
      int iRet = obj.Display(Arr);
      if(iRet==1)
      { 
        System.out.println("Multiplication of array is: 0");
      }
      else 
      {
        System.out.println("Multiplication of array is:"+iRet);
      }
      


    }
}