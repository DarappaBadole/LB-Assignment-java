/*
    write a java program which accept N number from user and accept one
    anoter number as NO , and return index of that NO

    Input : N :  6
    NO    :   66
    Elements :  85  66  3  66  93  88
    Output : 1
    
    Input : N :  6
    NO :   12
    Elements :  85  11  3  15  11  111
    Output : -1


*/

import java.util.*;

class Number
{
  public int LastOcc(int ilength ,int iNo)
  {
    Scanner sobj = new Scanner(System.in);
     int iCnt=-1;

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
          iCnt=j;
          
          
        }

       
       
    }
    return iCnt;



  }

}

class Program34_3
{
    public static void main(String arr[])
    {
    
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the size of array:");
      int iSize = sobj.nextInt();

      System.out.println("Enter the number that you want to chek:");
      int iNo = sobj.nextInt();

      Number obj = new Number();
      int iRet = obj.LastOcc(iSize,iNo);
      
      
    

       System.out.println(iRet);










    }
}