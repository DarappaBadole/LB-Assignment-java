import java.util.*;

class Pattern
{   char ch='A';
    int i=0;
    int j=0;
    public void Pattern(int iRows,int iCols)
    {
        for(i=1;i<=iRows;i++)
        {   
            ch ='A';
            for(j=1;j<=iCols;j++)
            {
                System.out.print(ch+"\t");
                ch++;

            }System.out.println("");
        }

    }
}

class Program36_1
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