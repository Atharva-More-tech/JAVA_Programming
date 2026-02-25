//  Description :accept one number , two positions from user and check whether bit at first or bit at second position is ON or OFF.
//  Input : 10 3 7
//  Output : TRUE

import java.util.*;

class program67_4
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iPos1 = 0, iPos2 = 0;
        int iMask1 = 0, iMask2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        System.out.println("Enter 1st the position :");
        iPos1 = sobj.nextInt();

        System.out.println("Enter 2nd the position :");
        iPos2 = sobj.nextInt();

        iMask1 = 1 << (iPos1 - 1);
        iMask2 = 1 << (iPos2 - 1);

        if((iNo & iMask1)!= 0 && (iNo & iMask2)!= 0)
        {
            System.out.println("FALSE");
        }
        else
        {
            System.out.println("TRUE");
        }   
    }
}