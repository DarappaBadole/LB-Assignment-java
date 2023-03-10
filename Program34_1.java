/*
    write a java program which accept N number from user and accept one
    anoter number as NO , Check wheter NO is present or not

    Input : N :  6
    NO    :   66
    Elements :  85  66  3  66  93  88
    Output : TRUE
    
    Input : N :  6
    NO :   12
    Elements :  85  11  3  15  11  111
    Output : FALSE


*/

import java.util.*;

class Number
{
  public boolean Check(int ilength ,int iNo)
  {
    Scanner sobj = new Scanner(System.in);
    boolean bAns=false;

    int Arr[] = new int[ilength];

    System.out.println("Enter elements:");
    for(int i=0;i<Arr.length;i++)
    {
        Arr[i] = sobj.nextInt();
    }

    for(int j=0;j<Arr.length;j++)
    {
        if(Arr[j]==iNo)
        {
            bAns=true;
            break;
        }

        else
        {
            bAns=false;
        }
    }
    return bAns;



  }

}

class Program34_1
{
    public static void main(String arr[])
    {
    
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the size of array:");
      int iSize = sobj.nextInt();

      System.out.println("Enter the number that you want to chek:");
      int iNo = sobj.nextInt();

      Number obj = new Number();
      boolean bRet = obj.Check(iSize,iNo);
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