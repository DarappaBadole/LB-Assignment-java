/*
write a java program which accept marks of N student sfrom user and 
display class of each student

Less than 35 - fail
Leass than 50 - Pass class
Less than 60 - second class
Less than 70 - First class
Greater than 70 - First class with Distinction

Input : 67.3   45.8  88.9  77.5  55.2
Output : 67.3   First class
         45.8   Pass class
         88.9   First class with Distinction
         77.5    First class with Distinction
         55.2     second class


*/
import java.util.*;

class MyArray
{
    public void Percentage(float Arr[])
    {
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i]<35)
            {
                System.out.println(Arr[i]+"\t" +"Fail");

            }
            else if(Arr[i]<50)
            {
                System.out.println(Arr[i]+"\t" +"Pass class");
                
            }

             else if(Arr[i]<60)
            {
                System.out.println(Arr[i]+"\t" +"second class");
                
            }

             else if(Arr[i]<70)
            {
                System.out.println(Arr[i]+"\t" +"First  class");
                
            }

             else if(Arr[i]>70)
            {
                System.out.println(Arr[i]+"\t" +"first class with distinction");
                
            }
        }

    }
}

class Program43_5
{
    public static void main(String arr[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int  iSize= sobj.nextInt();

        System.out.println("Enter the Marks of students:");
        
        float Arr[] = new float[iSize];

        for(int i=0;i<Arr.length;i++)
        {
            Arr[i] = sobj.nextFloat();

        }

        MyArray obj = new MyArray();

        obj.Percentage(Arr);



    }
}