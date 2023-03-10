
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

        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr.length;j++)
            {

            
            System.out.print(Arr[j]+"\t");
            }System.out.println("");

        }

    }
 }


 class Program38_1
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