/*
 write a java program which accept N numbers from user and display all such elements which are
 divisible by 3 and  5


 Input :  N :     6
 Elements  : 85  66  3  15  93  88

 output : 15
   



*/
import java.util.*;

class ArrayDemo
{
  public void Display(int Arr[])
  { 
    int iSum1=0;
    int iSum2=0;
     
     System.out.println("Numbers which are divisible three and  by five are :");
    for(int i=0;i<Arr.length;i++)
    {  
        if((Arr[i] % 3==0)&&(Arr[i]%5==0))
        {
            System.out.print(Arr[i]+"\t");

        }
       
    }
  }

 



}
class Program32_4
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