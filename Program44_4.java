/*
write a java program which accept array of characters from user and 
return difference between frequency of capital and frequency of small
characters

Input : b  N  e  B  R  b  A  I  O  G  i

Output : 3  (7-4)


*/

import java.util.*;

class MyArray
{
    public int Difference(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt1=0;
        int iCnt2=0;

        for(int i=0;i<Arr.length;i++)
        {
            if((Arr[i]>='A')&&(Arr[i]<='Z'))
            {
                iCnt1++;
            }

           else  if((Arr[i]>='a')&&(Arr[i]<='z'))
            {
                iCnt2++;
            }
           
        }return iCnt1-iCnt2;

    }
}

class Program44_4
{
    public static void main(String arr[])
    { 
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the array of characters:");
        String str = sobj.nextLine();

       MyArray obj = new MyArray();

     int iRet = obj.Difference(str);
     System.out.println("Difference of capital and small letters is:"+iRet);




     










    }
}
