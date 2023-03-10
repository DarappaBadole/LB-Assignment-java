
/*
write a java program which accept string from user and display below
pattern

Input: iRow  = 4
       iCol= 4

 Output :    *  *  *  #
             *  *  #  *
             *  #  *   *
             #  *  *   *

 */
 import java.util.*;
 class Pattern
 {
    public void Pattern(int iRow , int iCol)
    {   

        for(int i=iRow-1;i>=0;i--)
        {
            for(int j=0;j<iCol;j++)
            {
              if(i==j)
              {
                System.out.print("#"+"\t");
              }

              else 
              {
                System.out.print("*"+"\t");
              }

            }
           
            System.out.println("");
            
           
        }
        
         
         

    }
 }


 class Program40_1
 {
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int irow = sobj.nextInt();

        System.out.println("Enter the number of columns:");
        int iCol = sobj.nextInt();


        Pattern obj = new Pattern();
        obj.Pattern(irow,iCol);

        
    }
 }         