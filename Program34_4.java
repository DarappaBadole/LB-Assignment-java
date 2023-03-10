/*
write a java program which accept N numberas from user an daccept Range
, Display all elements from that range

Inout : N : 6
        start  : 60
        End :    90
        Elements  : 85  63  3  76  93  88
        Output : 66  76  88

*/
import java.util.*;

class Numbers
{
    public void Display(int Arr[],int iStart,int iEnd)
    {
        for(int i=0;i<Arr.length;i++)
        {
            if((Arr[i]>iStart)&&(Arr[i]<iEnd))
            {
                System.out.println(Arr[i]);
            }
        }






    }
}

class Program34_4
{
    public static void main(String arr[])
    {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the size of the array:");
      int iSize = sobj.nextInt();

      int Arr[] = new int[iSize];

      System.out.println("Enter the elements of array:");

      for(int i = 0; i<Arr.length;i++)
      {
        Arr[i] = sobj.nextInt();
      }

      System.out.println("Enter the starting position:");
      int iStart = sobj.nextInt();

      System.out.println("Enter the end position:");
      int iEnd = sobj.nextInt();



      Numbers obj  = new Numbers();
      obj.Display(Arr,iStart,iEnd);















    }
}