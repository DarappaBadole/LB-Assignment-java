/*
write a java program which accept number of rows and columns from 
user and display below pattern:

Input : i  rows = 4     iCols=3
Output :   1  2  3
           1  2  3
           1  2  3
           1  2  3

 */          

import java.util.*;

class Pattern
{   int iCnt=1;
    int i=0;
    int j=0;
    public void Pattern(int iRows,int iCols)
    {
        for(i=1;i<=iRows;i++)
        {   iCnt=1;
            
            for(j=1;j<=iCols;j++)
            {
              System.out.print(iCnt+"\t"); 
              iCnt++;
                
            }System.out.println("");
            
        }

    }
}

class Program37_2
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