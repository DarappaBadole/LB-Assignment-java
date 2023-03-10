/*
 Write a java program which accept string from user and return difference between
 frequency of small characters and frequency of capital characters

 Input : MarvellouS
 output : 6           (8-2)

*/
import java.util.*;

class StringDemo
{
 
 public int CountDiff(String s)
 {
    char Arr[] = s.toCharArray();
    int iCnt1=0;
    int iCnt2=0;

    for(int i=0;i<Arr.length;i++)
    {
        if((Arr[i]>='A')&&(Arr[i]<='Z'))
        {
            iCnt1++;
        }
        else
        {
            iCnt2++;
        }
    }return iCnt1-iCnt2;
 }
}


class Program31_3
{
    public static void main(String Arr[])
    { 
        StringDemo obj = new StringDemo();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        String str=sobj.nextLine();

        int iRet  = obj.CountDiff(str);
        if(iRet<0)
        {
            iRet = -iRet;
        }
        System.out.println("difference between capital ans small letters is :"+iRet);

    }
}