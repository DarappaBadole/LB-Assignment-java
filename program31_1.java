/*
 Accept a java program which accept string from user and count th nuber of capital letters

 Input : " Marvellous Multi OS"
 Output : 4



*/
import java.util.*;

class StringDemo
{
 public int CountCapital(String s)
 {

 int iCnt=0;

 for(int i=0;i<s.length();i++)
 {
    if((s.charAt(i)>='A')&&(s.charAt(i)<='Z'))
    {
        iCnt++;
    }
 }return iCnt;
 

 }

}

class program31_1
{
    public static void main(String arr[])
    {
      StringDemo obj = new StringDemo();
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the string :");
      String str = sobj.nextLine();

      int iRet = obj.CountCapital(str);
      System.out.println("Number of capital letters: are : "+iRet);









    }
}