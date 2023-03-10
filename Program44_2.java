/*
write a  program which accept array of characters from user and count number
 vowels characters

Input : b  N  e  B  R  b  A   i   G  i
Output : 4
*/

import java.util.*;

class MyArray
{
    public int ArrayCountVowels(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt=0;

        for(int i=0;i<Arr.length;i++)
        {
            if((Arr[i]=='a')||(Arr[i]=='e')||((Arr[i]=='i'))||(Arr[i]=='o')||(Arr[i]=='u')||(Arr[i]=='A')||(Arr[i]=='E')||(Arr[i]=='I')||(Arr[i]=='O')||(Arr[i]=='U'))
            {
                 iCnt++;
            }
        }return iCnt;

    }
}

class Program44_2
{
    public static void main(String arr[])
    { 
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the array of characters:");
        String str = sobj.nextLine();

       MyArray obj = new MyArray();

     int iRet = obj.ArrayCountVowels(str);
     System.out.println("Number of vowels in the array are:"+iRet);




     










    }
}