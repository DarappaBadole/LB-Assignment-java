/*
write  a java program which accept number of rows and coulmns from user
and display below pattern

Input : iRows =3   iCols = 5

Output :  A  A  A  A  A
          B  B  B  B  B
          C  C  C  C  C
*/

import java.util.*;

class Pattern
{   char ch='A';
    int i=0;
    int j=0;
    public void Pattern(int iRows,int iCols)
    {
        for(i=1;i<=iRows;i++)
        {   
            
            
            for(j=1;j<=iCols;j++)
            {
                System.out.print(ch+"\t");
                

            }System.out.println("");
            ch++;
        }

    }
}

class Program36_3
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