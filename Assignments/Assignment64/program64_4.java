// Description : Checks whether 7th, 8th, 9th bits are ON or OFF.
// Inputs : // 7th bit = 64 
            // 8th bit = 128 
            // 9th bit = 256


import java.util.Scanner;

class program64_4
{
    public static void main(String A[]) 
    {
        int iNo = 0, iMask7 = 0, iMask8 = 0, iMask9 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        iMask7 = 0x00000040;
        iMask8 = 0x00000080;
        iMask9 = 0x00000100;

        if((iNo & iMask7) == iMask7)
        {
            System.out.println("7th bit is ON");
        }
        else
        {
            System.out.println("7th bit is OFF");
        }

        if((iNo & iMask8) == iMask8)
        {
            System.out.println("8th bit is ON");
        }
        else
        {
            System.out.println("8th bit is OFF");
        }

        if((iNo & iMask9) == iMask9)
        {
            System.out.println("9th bit is ON");
        }
        else
        {
            System.out.println("9th bit is OFF");
        }

    }
}