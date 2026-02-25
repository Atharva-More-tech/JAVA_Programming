//  Description :which accept one number from user and count number of ON (1) bits in it without using % and / operator.
//  Input : 11
//  Output : 3

import java.util.*;

class program67_1
{
    public static void main(String A[])
    {
        int iNo = 0, iCount = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            if((iNo & 1) == 1)
            {
                iCount++;
            }
            iNo = iNo >> 1;
        }
        System.out.println("Number of ON bits :"+iCount);


    }
}