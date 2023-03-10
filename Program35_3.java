/*
write a program which 2 strings from user and check whether 
First N N contents of two strings are equal or not

Note : if third parameter is greater than the size of second string
       then concat whole string after first string

Input : "Marvellous Infosystem"
        "Marvellous Logic Building"
        10

 Output : TRUE
 */

 import java.util.*;

 class StringDemo
 {  
    boolean s;
    int count=0;
    public boolean StrNCmpX(String src,String dest,int iNo)
    {
        char Arr1[] = src.toCharArray();
        char Arr2[] = dest.toCharArray();
       
        
        if(iNo>Arr2.length)
        {
           System.out.println(src+dest);
        }

        else
        {
            
            for(int i=0;i<iNo;i++)
            {
                if(src.charAt(i)==dest.charAt(i))
                {
                    count++;
                }
            
            }
            
        }
        if(count==iNo)
        {
            return true;
        }
        else
        {
            return false;
        }

        

    }
 }
 class Program35_3
{
 public static void main(String  arr[])
 {
 
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter First String :");
    String s1 = sobj.nextLine();
    
    System.out.println("Enter Second String :");
    String s2 = sobj.nextLine();

    System.out.println("Enter the Number:");
    int iNo = sobj.nextInt();

     StringDemo obj = new StringDemo();

     boolean s = obj.StrNCmpX(s1,s2,iNo);
     if(s==true)
     {
        System.out.println("TRUE");

     }

     else
     {
        System.out.println("FALSE");
     }





 }



}       