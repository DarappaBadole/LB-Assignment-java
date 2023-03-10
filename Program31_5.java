

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
    public void Reverse(String s)
    {
      char Arr[] = s.toCharArray();
      int iAns=0;

      for(int i=Arr.length-1 ; i>=0;i--)
      {
        System.out.print(Arr[i]);

      }
      

       

    }

    

}

class Program31_5
{
    public static void main(String arr[])
    {
     Scanner sobj = new Scanner(System.in);
     System.out.println("Enter String:");
     String str = sobj.nextLine();

     StringDemo obj = new StringDemo();
     obj.Reverse(str);

     







    }
}