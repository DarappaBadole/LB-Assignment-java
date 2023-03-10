/*
write  a java program which accept number of rows and coulmns from user
and display below pattern

Input : iRows =3   iCols = 5

Output :  1  2  3  4
          5  6  7  8 
          9  10  11  12  
*/

import java.util.*;

class Pattern
{   
    int iCnt=1;
    int i=0;
    int j=0;
    public void Pattern(int iRows,int iCols)
    {
        for(i=1;i<=iRows;i++)
        {   
            
            
            for(j=1;j<=iCols;j++)
            {
                System.out.print(iCnt+"\t");
                iCnt++;
                

            }System.out.println("");
            
        }

    }
}

class Program36_5
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