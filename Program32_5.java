/*
 write a java program which accept N numbers from user and display all such elements which are
 multiples of 11


 Input :  N :     6
 Elements  : 85  66  3  55  93  88

 output :  66  55  88
   



*/
import java.util.*;

class ArrayDemo
{
  public void Display(int Arr[])
  { 
    int iSum1=0;
    int iSum2=0;
     
     System.out.println("Numbers which are multiples of 11 are :");
    for(int i=0;i<Arr.length;i++)
    {  
        if((Arr[i] % 11==0))
        {
            System.out.print(Arr[i]+"\t");

        }
       
    }
  }

 



}
class Program32_5
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


     obj.Display(Arr);
     


     
     

     

     





     

    }
}