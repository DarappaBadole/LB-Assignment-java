
/*

write a java program which accept array of characters from user and replace
each capital characters with its corresponding small characters:

Input :  b  N  j  B  R  b  A  d  G  G
Output : b  n  j  b  r  b  a  d  g  g

*/
import java.util.*;

class MyArray
{
    public void ArrayReplace(String str)
    {

        char Arr[] = str.toCharArray();
        int ASC=0;

        for(int i=0;i<Arr.length;i++)
        {
            if((Arr[i]>='A')&&(Arr[i]<='Z'))
            {
                Arr[i]+=32;
                System.out.print(Arr[i]+"\t");
            }
            

            else
            {
                System.out.print(Arr[i] +"\t");
            }
             
        }

    }
}

class Program44_1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        String str = sobj.nextLine();

        MyArray obj =new MyArray();
        obj.ArrayReplace(str);




    }
}