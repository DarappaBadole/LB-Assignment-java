/*
   write a java program which accept number from user and return the count 
   of odd numbers

   Input : 2395
   output : 3

   Input : -1018
   output : 2

   Input : 8462
   output : 0

*/
import java.util.*;

class iDigit
{
    public int CountOdd(int iNo)
    {
        int iDigit =0;
        int iCnt=0;
        if(iNo<0)
        {
            iNo = -iNo;
        }

        while(iNo!=0)
        {

        
             iDigit = iNo%10;

             if(iDigit % 2!=0)
             {
                iCnt++;
             }

             iNo = iNo/10;

        }return iCnt;
    }

}

class Program33_2
{
    public static void main(String arr[])
    {
        iDigit obj = new iDigit();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int iNo  = sobj.nextInt();

        int iRet =obj. CountOdd(iNo);
        System.out.println("odd count is:"+iRet);














    }
}