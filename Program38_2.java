
/*
write a java program which accept string from user and display below
pattern

Input: Hello
Output :  H  e  l  l  o
          H  e  l  l  o
          H  e  l  l  o
          H  e  l  l  o
 */
 import java.util.*;
 class Pattern
 {
    public void Pattern(String str)
    {
        char Arr[] = str.toCharArray();

        for(int i=Arr.length-1;i>=0;i--)
        {
            for(int j=0;j<Arr.length;j++)
            {
              if(i>=j)
              {

              
              System.out.print(Arr[j]+"\t");
              }
            

            }System.out.println("");
            
           
        }

    }
 }


 class Program38_2
 {
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sobj.nextLine();

        Pattern obj = new Pattern();
        obj.Pattern(s);

        
    }
 }         