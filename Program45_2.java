/*
write a java program which accept string from user and print frequency of each 
word:

Input : India is Demo India Hello Demo
Output : India   2
         is      1
         Demo    2
         Hello   1

 */


import java.util.*;

class MyString
{
    public void DemoString(String str)
    {
        char Arr1[] = str.toCharArray();
        char Arr2[] = Arr1;
        int iStart=0 , iEnd = 0;

        int iCnt=0;

        for(int i=0;i<Arr1.length;i++)
        {   
            for(int j=0;j<Arr2.length;j++)
            {
                if(Arr1[i]==Arr2[j])
                {
                    iCnt++;
                }
            }
            System.out.print(Arr1[i]+"\t"+iCnt);
            iCnt=0;
        }
         

    }
    
}


class Program45_2
{
    public static void main(String arr[])
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the  first string : ");
        String str = sobj.nextLine();

       
        MyString obj = new MyString();
        obj.DemoString(str);

       


    }
}