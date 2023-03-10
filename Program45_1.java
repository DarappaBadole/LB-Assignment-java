/*
write a java program which accept two strings fro user and check whether first
string is the rotation of second string or not

Input : abcdefg        cdefgab
Output : True

*/
import java.util.*;

class MyString
{
    public boolean ChkString(String str1, String str2)
    {
        char Arr1[] = str1.toCharArray();
        char Arr2[] = str2.toCharArray();
       
        int iCnt=0;

        for(int i=0;i<Arr1.length;i++)
        {
            for(int j=0;j<Arr2.length;j++)
            {
                if(Arr1[i]==Arr2[j])
                {
                    iCnt++;
                }
            }
           
        }
         if(iCnt==str1.length())
            {
                return true;
            }
            else 
            {
                return false;
            }

    }
    
}


class Program45_1
{
    public static void main(String arr[])
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the  first string : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter the second  string : ");
        String str2 = sobj.nextLine();

        MyString obj = new MyString();
        boolean bRet = obj.ChkString(str1,str2);

        if(bRet==true)
        {
            System.out.println("True");

        }

        else if(bRet==false)
        {
            System.out.println("False");
        }





    }
}