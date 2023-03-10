/*
write a java program which accept number of rows and columns from 
user and display below pattern:

Input : i  rows = 3    iCols=4
Output :   1  1  1  1
           2  2  2  2 
           3  3  3  3 
           4  4  4  4
 */          

import java.util.*;

class Pattern
{   int iCnt=1;
    int i=0;
    int j=0;
    public void Pattern(int iRows,int iCols)
    {
        for(i=1;i<=iRows;i++)
        {  
           
            for(j=1;j<=iCols;j++)
            {
              System.out.print(iCnt+"\t"); 
              
                
            }System.out.println("");
            iCnt++;
            
        }

    }
}

class Program37_5
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