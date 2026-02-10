// Description : Checks whether 7th, 15th, 21st, and 28th bits are ON or OFF.
// Inputs : 7th bit = 64            ON
//          15th bit = 16384        ON
//          21st bit = 1048576      ON
//          28th bit = 134217728    ON


import java.util.Scanner;

class program64_3
{
    public static void main(String A[]) 
    {
        int iNo = 0, iMask7 = 0, iMask15 = 0, iMask21 = 0, iMask28 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        iMask7 = 0x00000040;
        iMask15 = 0x00004000;
        iMask21 = 0x00100000;
        iMask28 = 0x08000000;

        if((iNo & iMask7) == iMask7)
        {
            System.out.println("7th bit is ON");
        }
        else
        {
            System.out.println("7th bit is OFF");
        }

        if((iNo & iMask15) == iMask15)
        {
            System.out.println("15th bit is ON");
        }
        else
        {
            System.out.println("15th bit is OFF");
        }

        if((iNo & iMask21) == iMask21)
        {
            System.out.println("21th bit is ON");
        }
        else
        {
            System.out.println("21th bit is OFF");
        }

        if((iNo & iMask28) == iMask28)
        {
            System.out.println("28th bit is ON");
        }
        else
        {
            System.out.println("28th bit is OFF");
        }

    }
}