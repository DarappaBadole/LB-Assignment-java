/*
   write a java program which accept number from user and return 
   Difference between summation of even and summation of odd numbers
   Input : 2395
   output : 15

   Input : 1018
   output : 6

   Input : 8440
   output : 16

   Input : 5733
   Output : 18

*/
import java.util.*;

class iDigit
{
    public int CountDiff(int iNo)
    {   
        int iSum1=0;
        int iSum2=0;
        int iDigit =0;
        int iCnt=0;
        if(iNo<0)
        {
            iNo = -iNo;
        }

        while(iNo!=0)
        {
             iDigit = iNo%10;
             if(iDigit %2==0)
             {
                iSum1=iSum1+iDigit;
             }

             else
             {
                iSum2 = iSum2+iDigit;
             }
             
             iNo = iNo /10;

             

        }return iSum1-iSum2;
    }

}

class Program33_5
{
    public static void main(String arr[])
    {
        iDigit obj = new iDigit();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int iNo  = sobj.nextInt();

        int iRet =obj.CountDiff(iNo);
        if(iRet<0)
        {
            iRet=-iRet;
        }
        System.out.println("Difference is:"+iRet);



    }
}