//  Description :accept one number from user and range of positions from user. Toggle all bits from that range.
//  Input : 897     9       13

import java.util.*;

class program67_5
{
    public static void main(String A[])
    {
        long iNo = 0;
        int iStart = 0, iEnd = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        iNo = sobj.nextLong();

        System.out.println("Enter the Start position :");
        iStart = sobj.nextInt();

        System.out.println("Enter the End position :");
        iEnd = sobj.nextInt();

        for(int i = iStart; i <= iEnd; i++)
        {
            iNo = iNo ^ (1L << (i -1));
        }

        System.out.println("Updated number is :"+iNo);
    }
}