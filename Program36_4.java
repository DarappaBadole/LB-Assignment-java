/*
write  a java program which accept number of rows and coulmns from user
and display below pattern

Input : iRows =3   iCols = 5

Output :  4  4  4  4  4  
          3  3  3  3  3 
          2  2  2  2  2
          1  1  1  1  1
*/

import java.util.*;

class Pattern
{  
    int i=0;
    int j=0;
    public void Pattern(int iRows,int iCols)
    {
        for(i=iRows;i>0;i--)
        {   
            
            
            for(j=1;j<=iCols;j++)
            {
                System.out.print(i+"\t");
                

            }System.out.println("");
            
        }

    }
}

class Program36_4
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of columns:");
        int iCol = sobj.nextInt();

        Pattern obj = new Pattern();
        obj.Pattern(iRow,iCol);




    }
}