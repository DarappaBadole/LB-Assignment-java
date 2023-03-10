/*
 write a java program which accept N numbers from user and return difference between
 summation of even elements and summation of odd elements


 Input :  N :     6
 Elements  : 85  66  3  80  93  88

 output : 53 (234 - 181)



*/
import java.util.*;

class ArrayDemo
{
  public int difference(int Arr[])
  { 
    int iSum1=0;
    int iSum2=0;

    for(int i=0;i<Arr.length;i++)
    {  
        if(Arr[i] % 2==0)
        {
            iSum1=iSum1+Arr[i];

        }
        else
        {
            iSum2=iSum2+Arr[i];
        }
         
    }
    return iSum1-iSum2;
  }
 



}
class Program32_1
{
    public static void main(String arr[])
    {
        ArrayDemo obj = new ArrayDemo();

     Scanner sobj = new Scanner(System.in);

     System.out.println("Enter the size of array:");
     int iSize=  sobj.nextInt();

     int Arr[] = new int[iSize];
     System.out.println("Enter the elements of array :");

     for(int i=0;i<Arr.length;i++)
     {

        Arr[i]= sobj.nextInt();

     }
      

      System.out.println("Elements of array are:");
     for(int i=0;i<Arr.length;i++)
     {
        System.out.println(Arr[i]);
     }


     int iRet = obj.difference(Arr);
     System.out.println("Difference is :"+iRet);


     
     

     

     





     

    }
}