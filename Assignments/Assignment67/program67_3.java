//  Description :accept one number from user and check whether 9th or 12th bit is on or off.
//  Input : 257
//  Output : TRUE

import java.util.*;

class program67_3
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iMask1 = 0x0000100;
        int iMask2 = 0x0000800;           

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number :");
        
        iNo = sobj.nextInt();

        if( (iNo & (iMask1 | iMask2)) != 0 )       
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}