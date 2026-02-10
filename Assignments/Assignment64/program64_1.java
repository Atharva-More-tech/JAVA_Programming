// Description : checks whether 15th bit is On or OFF.
// Inputs : 16384 = ON
//          32768 = OFF

import java.util.Scanner;

class program64_1
{
    public static void main(String A[]) 
    {
        int iNo = 0, iMask = 0, iResult = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        iMask = 0x00004000;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("15th bit is ON");
        }
        else
        {
            System.out.println("15th bit is OFF");
        }
    }
}