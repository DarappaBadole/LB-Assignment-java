/*
   write a java program which accept number from user and return the count 
   of digits in between 3 and 7

   Input : 2395
   output : 1

   Input : 1018
   output : 0

   Input : 4521
   output : 2

   Input : 9922
   Output : 0

*/
import java.util.*;

class iDigit
{
    public int CountRange(int iNo)
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

             if((iDigit>3)&&(iDigit<7))
             {
                iCnt++;
             }

             iNo = iNo/10;

        }return iCnt;
    }

}

class Program33_3
{
    public static void main(String arr[])
    {
        iDigit obj = new iDigit();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int iNo  = sobj.nextInt();

        int iRet =obj. CountRange(iNo);
        System.out.println("Renge count is:"+iRet);



    }
}