/*
write java program which accept array of characters from user and accept 
one character. return occurence of that character without considering
case.

Input: b  N  e  B  R  b  A  i  G  i  B 

character:  b
Output : 4

*/

import java.util.*;

class MyArray
{
    public int Search(String str, char ch)
    {
        char Arr[] = str.toCharArray();
        int iCnt=0;
        
        for(int i=0;i<Arr.length;i++)
        {

        
                if((Arr[i]>='A')&&(Arr[i]<='Z'))
                {
                    Arr[i]+=32;

                }    

                    if(Arr[i]==ch)
                    {
                        iCnt++;
                    }
                

        }
        return iCnt;

    }

}

class Program44_3
{
    public static void main(String arr[])
    { 
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the array of characters:");
        String str = sobj.nextLine();

        System.out.println("Enter the character:");
        char ch = sobj.next().charAt(0);

       MyArray obj = new MyArray();

     int iRet = obj.Search(str,ch);
     System.out.println("occurance of character in the array are:"+iRet);




     










    }
}

