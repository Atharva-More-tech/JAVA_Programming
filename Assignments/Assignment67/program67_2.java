//  Description :accept two numbers from user and display position of common ON bits from that two numbers.
//  Input : 10 15   (1010 1111)
//  Output : 2 4

import java.util.*;

class program67_2
{
    public static void main(String A[])
    {
        int iNo1 = 0, iNo2 = 0, iPos = 1;
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter 1st the number :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter 2nd the number :");
        iNo2 = sobj.nextInt();

        iResult = iNo1 & iNo2;

        while(iResult != 0)
        {
            if((iResult & 1) == 1)
            {
                System.out.println(iPos+" ");
            }
            iResult = iResult >> 1;
            iPos++;
        }
    }
}