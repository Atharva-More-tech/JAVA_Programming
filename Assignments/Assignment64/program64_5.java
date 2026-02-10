// Description : Checks whether first and last bits are ON or OFF.
// Input :  First bit = 1
//          Last bit = 2147483648


import java.util.Scanner;

class program64_5
{
    public static void main(String A[]) 
    {
        long iNo = 0;
        long iMaskFirst = 0, iMaskLast = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        iNo = sobj.nextLong();

        iMaskFirst = 0x00000001L;
        iMaskLast = 0x80000000L;

        if((iNo & iMaskFirst)==iMaskFirst)
        {
            System.out.println("First (1) bit is ON");
        }
        else
        {
            System.out.println("First (1) bit is OFF");
        }
        if((iNo & iMaskLast)==iMaskLast)
        {
            System.out.println("last (32) bit is ON");
        }
        else
        {
            System.out.println("last (32) bit is OFF");
        }

    }
}