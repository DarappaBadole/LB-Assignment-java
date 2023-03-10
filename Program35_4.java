/*
Accept String  from user and reverse the contents of that string by 
toggling the case:

Input : aCBdef
Output : FEDcbA

*/

import java.util.*;

class StringDemo
{
    public String StrRevTogX(String str)
    {   
        String s1 = "";
        char Arr[] = str.toCharArray();
        for(int i=Arr.length-1;i>=0;i--)
        {
            if((Arr[i]>='A')&&(Arr[i]<='Z'))
            {
                Arr[i]+=32;

            }
            else
            {

            
                Arr[i]-=32;
            }
             s1 = s1 + Arr[i];

        }
        return s1;
           
    }
        
}


class Program35_4
{
    public static void main(String arr[])
    {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the string:");
      String s = sobj.nextLine();
      
      StringDemo obj = new StringDemo();
      String ans = obj.StrRevTogX(s);

      System.out.println(ans);













    }
}