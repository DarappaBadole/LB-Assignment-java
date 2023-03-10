
/*
write a java program which accept string from user and display below
pattern

Input: iRow  = 6
       iCol= 6

 Output :    
                *   *  *  *  *  *
                *            *  *
                *         *     * 
                *      *        *
                *  *            *
                *  *  *  *  *  *                    

 */
 import java.util.*;
 class Pattern
 {
    public void Pattern(int iRow , int iCol)
    {   

        for(int i=iRow;i>=1;i--)
        {
            for(int j=1;j<=iCol;j++)
            {
              if(i==1 || j==1 || i==iRow || j==iCol)
              {
                System.out.print("*"+"\t");
              }
              else if(i==j)
              {
                System.out.print("*"+"\t");
              }
              else if(i>j)
              {
                System.out.print("#"+"\t");
              }

              else if(i<j)
              {
                System.out.print("$"+"\t");

              }
            }
           
            System.out.println("");
            
           
        }
        
         
         

    }
 }


 class Program40_4
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