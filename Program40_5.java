
/*
write a java program which accept string from user and display below
pattern

Input: iRow  = 4
       iCol= 4

 Output :    
                1  2  3  4  5  
                1  2        5
                1     3     5
                1        4  5
                1  2  3  4  5 
 */
 import java.util.*;
 class Pattern
 {
    public void Pattern(int iRow , int iCol)
    {   

        for(int i=1;i<=iRow;i++)
        {
            for(int j=1;j<=iCol;j++)
            {
              if(i==1 || j==1 || i==iRow || j==iCol || i==j)
              {
                System.out.print(j+"\t");
              }

              else
              {
                System.out.print("\t");
              }
              
            }
           
            System.out.println("");
            
           
        }
        
         
         

    }
 }


 class Program40_5
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