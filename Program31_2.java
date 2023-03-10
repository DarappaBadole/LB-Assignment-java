import java.util.*;

class StringDemo
{
 
 public int SmallCount(String s)
 { 
    int iCnt=0;
    char Arr[] = s.toCharArray();

    for(int i =0;i<Arr.length;i++)
    {
        if((Arr[i]>='a')&&(Arr[i]<='z'))
        {
            iCnt++;
        }
    }return iCnt;

 }


}
class Program31_2
{
    public static void main(String arr[])
    {
        StringDemo obj = new StringDemo();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String:");
        String str=sobj.nextLine();

        int iRet  = obj.SmallCount(str);
        System.out.println("Number of small letters are :"+iRet);






    




    }
}