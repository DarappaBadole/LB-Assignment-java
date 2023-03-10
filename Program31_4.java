

/*
write a java program which accept string from user and check whether it contains
vowels in it or not

Input : "marvellous"
outpiut : True

Input : Demo
output : True

Input : xyz
output : False


*/
import java.util.*;

class StringDemo
{
    public boolean ChkVowel(String s)
    {
      char Arr[] = s.toCharArray();
      int iAns=0;

      for(int i=0;i<Arr.length;i++)
      {

       if((Arr[i]=='A')||(Arr[i]=='E')||(Arr[i]=='I')||(Arr[i]=='O')||(Arr[i]=='U')||(Arr[i]=='a')||(Arr[i]=='e')||(Arr[i]=='i')||(Arr[i]=='o')||(Arr[i]=='u'))
       {
          iAns++;
          break;
       }

      }
      if(iAns==0)
       {
        return false;
       }
       else
       {
        return true;
       }
     



    }

}

class Program31_4
{
    public static void main(String arr[])
    {
     Scanner sobj = new Scanner(System.in);
     System.out.println("Enter String:");
     String str = sobj.nextLine();

     StringDemo obj = new StringDemo();
     boolean bRet = obj.ChkVowel(str);

     if(bRet==true)
     {
        System.out.println("TRUE");

     }

     else
     {
        System.out.println("FALSE");
     }







    }
}