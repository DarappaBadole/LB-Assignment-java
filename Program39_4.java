
/*
write a java program which accept string from user and display below
pattern

Input: Hello
Output :  H 
          H e
          H  e  l
          H  e  l  l
          H  e  l  l  o
          H  e  l  l
          H  e  l
          H  e  
          H
 */
 import java.util.*;
 class Pattern
 {
    public void Pattern(String str)
    {   char Arr1[] = str.toCharArray();
        char Arr[] = str.toCharArray();
        String s;

        for(int i=Arr.length-1;i>=0;i--)
        {
            for(int j=0;j<Arr.length;j++)
            {
              if(i>=j)
              {
                
               
              System.out.print(Arr[j]+"\t");
              }

              else
              {
                System.out.print("*"+"\t");
              }
               
            

            }
           
            System.out.println("");
            
           
        }
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr.length;j++)
            {
              if(i>=j)
              {
                
               
              System.out.print(Arr[j]+"\t");
              }

              else 
              {
                System.out.print("*"+"\t");
              }

              

            }
           
            System.out.println("");
            
        }
         System.out.println("");
            
         
         

    }
 }


 class Program39_4
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