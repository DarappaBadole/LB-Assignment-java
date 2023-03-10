/*
write  a java program which accept number of rows and coulmns from user
and display below pattern
*/

import java.util.*;

class Pattern
{   char ch1='A';
    char ch2='a';
    int i=0;
    int j=0;
    public void Pattern(int iRows,int iCols)
    {
        for(i=1;i<=iRows;i++)
        {   ch1='A';
            ch2 ='a';
            for(j=1;j<=iCols;j++)
            {
                if(i %2!=0)
                {

                
                System.out.print(ch1+"\t");
                ch1++;
                }

                else 
                {
                    System.out.print(ch2+"\t");
                    ch2++;
                }

            }System.out.println("");
        }

    }
}

class Program36_2
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